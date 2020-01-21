package typings.uiGrid.mod.importer

import typings.uiGrid.mod.IGridInstanceOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions[TEntity] extends js.Object {
  /**
    * Whether or not importer is enabled.  Automatically set
    * to false if the user's browser does not support the required fileApi.
    * Otherwise defaults to true.
    * @default true
    */
  var enableImporter: js.UndefOr[Boolean] = js.undefined
  /**
    * A mandatory callback function that adds data to the source data array.
    * The grid generally doesn't add rows to the source data array,
    * it is tidier to handle this through a user callback.
    * @param {IGridInstance} grid The grid we're importing into, may be useful in some way
    * @param {Array<TEntity>} newObjects An array of new objects that you should add to your data
    */
  var importerDataAddCallback: js.UndefOr[
    js.Function2[/* grid */ IGridInstanceOf[TEntity], /* newObjects */ js.Array[TEntity], Unit]
  ] = js.undefined
  /**
    * A callback function that provides custom error handling,
    * rather than the standard grid behaviour of an alert box and a console message.
    * You might use this to internationalise the console log messages,
    * or to write to a custom logging routine that returned errors to the server.
    * @param {IGridInstance} grid the grid we're importing into, may be useful if you're positioning messages
    * @param {string} errorKey one of the i18n keys the importer can return -
    *        * importer.noHeaders
    *        * importer.noObjects
    *        * importer.invalidCsv
    *        * importer.invalidJson
    *        * importer.jsonNotArray
    * @param {string} consoleMessage the English console message that importer would have written
    * @param {any} context the context data that importer would have appended to that console message,
    *        often the file content itself or the element that is in error
    */
  var importerErrorCallback: js.UndefOr[
    js.Function4[
      /* grid */ IGridInstanceOf[TEntity], 
      /* errorKey */ String, 
      /* consoleMessage */ String, 
      /* context */ js.Any, 
      Unit
    ]
  ] = js.undefined
  /**
    * A callback function that will filter (usually translate) a single header.
    * Used when you want to match the passed in column names to the column displayName after the header filter.
    * Your callback routine needs to return the filtered header value.
    * @param {string} displayName The displayName to translate
    * @returns {string} The translated name
    */
  var importerHeaderFilter: js.UndefOr[js.Function1[/* displayName */ String, String]] = js.undefined
  /**
    * An object on which we call `new` to create each new row before inserting it into
    * the data array.  Typically this would be a $resource entity, which means that if you're using
    * the rowEdit feature, you can directly call save on this entity when the save event is triggered.
    *
    * Defaults to a vanilla javascript object
    * @default {}
    */
  var importerNewObject: js.UndefOr[js.Function] = js.undefined
  /**
    * A callback that massages the data for each object.
    * For example, you might have data stored as a code value, but display the decode.
    * This callback can be used to change the decoded value back into a code.
    * Defaults to angular.identity.
    * @param {IGridInstance} grid The grid
    * @param {TEntity} newObject The new object as importer has created it.  Modify it and return modified
    * version
    * @returns {TEntity} The modified object
    * @default angular.identity
    */
  var importerObjectCallback: js.UndefOr[
    js.Function2[/* grid */ IGridInstanceOf[TEntity], /* newObject */ TEntity, TEntity]
  ] = js.undefined
  /**
    * A callback function that will process headers using custom
    * logic.  Set this callback function if the headers that your user will provide in their
    * import file don't necessarily match the grid header or field names.  This might commonly
    * occur where your application is internationalised, and therefore the field names
    * that the user recognises are in a different language than the field names that
    * ui-grid knows about.
    *
    * Defaults to the internal `processHeaders` method, which seeks to match using both
    * displayName and column.name.  Any non-matching columns are discarded.
    *
    * Your callback routine should respond by processing the header array, and returning an array
    * of matching column names.  A null value in any given position means "don't import this column"
    * @param {IGridInstance} grid the grid we're importing into
    * @param {Array<string>} headerArray an array of the text from the first row of the csv file,
    * which you need to match to column.names
    * @returns {Array<string>} array of matching column names, in the same order as the headerArray
    */
  var importerProcessHeaders: js.UndefOr[
    js.Function2[
      /* grid */ IGridInstanceOf[TEntity], 
      /* headerArray */ js.Array[String], 
      js.Array[String]
    ]
  ] = js.undefined
  /**
    * Whether or not to show an item in the grid menu.
    * Defaults to true.
    * @default true
    */
  var importerShowMenu: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply[TEntity](
    enableImporter: js.UndefOr[Boolean] = js.undefined,
    importerDataAddCallback: (/* grid */ IGridInstanceOf[TEntity], /* newObjects */ js.Array[TEntity]) => Unit = null,
    importerErrorCallback: (/* grid */ IGridInstanceOf[TEntity], /* errorKey */ String, /* consoleMessage */ String, /* context */ js.Any) => Unit = null,
    importerHeaderFilter: /* displayName */ String => String = null,
    importerNewObject: js.Function = null,
    importerObjectCallback: (/* grid */ IGridInstanceOf[TEntity], /* newObject */ TEntity) => TEntity = null,
    importerProcessHeaders: (/* grid */ IGridInstanceOf[TEntity], /* headerArray */ js.Array[String]) => js.Array[String] = null,
    importerShowMenu: js.UndefOr[Boolean] = js.undefined
  ): IGridOptions[TEntity] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableImporter)) __obj.updateDynamic("enableImporter")(enableImporter.asInstanceOf[js.Any])
    if (importerDataAddCallback != null) __obj.updateDynamic("importerDataAddCallback")(js.Any.fromFunction2(importerDataAddCallback))
    if (importerErrorCallback != null) __obj.updateDynamic("importerErrorCallback")(js.Any.fromFunction4(importerErrorCallback))
    if (importerHeaderFilter != null) __obj.updateDynamic("importerHeaderFilter")(js.Any.fromFunction1(importerHeaderFilter))
    if (importerNewObject != null) __obj.updateDynamic("importerNewObject")(importerNewObject.asInstanceOf[js.Any])
    if (importerObjectCallback != null) __obj.updateDynamic("importerObjectCallback")(js.Any.fromFunction2(importerObjectCallback))
    if (importerProcessHeaders != null) __obj.updateDynamic("importerProcessHeaders")(js.Any.fromFunction2(importerProcessHeaders))
    if (!js.isUndefined(importerShowMenu)) __obj.updateDynamic("importerShowMenu")(importerShowMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions[TEntity]]
  }
}

