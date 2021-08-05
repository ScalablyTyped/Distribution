package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDialogOptions extends StObject {
  
  /**
    * Allow to select files, defaults to `true`.
    */
  var canSelectFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow to select folders, defaults to `false`.
    */
  var canSelectFolders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow to select many files or folders.
    */
  var canSelectMany: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource the dialog shows when opened.
    */
  var defaultUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * A set of file filters that are used by the dialog. Each entry is a human-readable label,
    * like "TypeScript", and an array of extensions, e.g.
    * ```ts
    * {
    *     'Images': ['png', 'jpg']
    *     'TypeScript': ['ts', 'tsx']
    * }
    * ```
    */
  var filters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * A human-readable string for the open button.
    */
  var openLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Dialog title.
    *
    * This parameter might be ignored, as not all operating systems display a title on open dialogs
    * (for example, macOS).
    */
  var title: js.UndefOr[String] = js.undefined
}
object OpenDialogOptions {
  
  inline def apply(): OpenDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDialogOptions]
  }
  
  extension [Self <: OpenDialogOptions](x: Self) {
    
    inline def setCanSelectFiles(value: Boolean): Self = StObject.set(x, "canSelectFiles", value.asInstanceOf[js.Any])
    
    inline def setCanSelectFilesUndefined: Self = StObject.set(x, "canSelectFiles", js.undefined)
    
    inline def setCanSelectFolders(value: Boolean): Self = StObject.set(x, "canSelectFolders", value.asInstanceOf[js.Any])
    
    inline def setCanSelectFoldersUndefined: Self = StObject.set(x, "canSelectFolders", js.undefined)
    
    inline def setCanSelectMany(value: Boolean): Self = StObject.set(x, "canSelectMany", value.asInstanceOf[js.Any])
    
    inline def setCanSelectManyUndefined: Self = StObject.set(x, "canSelectMany", js.undefined)
    
    inline def setDefaultUri(value: Uri): Self = StObject.set(x, "defaultUri", value.asInstanceOf[js.Any])
    
    inline def setDefaultUriUndefined: Self = StObject.set(x, "defaultUri", js.undefined)
    
    inline def setFilters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setOpenLabel(value: String): Self = StObject.set(x, "openLabel", value.asInstanceOf[js.Any])
    
    inline def setOpenLabelUndefined: Self = StObject.set(x, "openLabel", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
