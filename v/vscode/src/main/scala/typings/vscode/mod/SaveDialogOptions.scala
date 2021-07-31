package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveDialogOptions extends StObject {
  
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
    * A human-readable string for the save button.
    */
  var saveLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Dialog title.
    *
    * This parameter might be ignored, as not all operating systems display a title on save dialogs
    * (for example, macOS).
    */
  var title: js.UndefOr[String] = js.undefined
}
object SaveDialogOptions {
  
  @scala.inline
  def apply(): SaveDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveDialogOptions]
  }
  
  @scala.inline
  implicit class SaveDialogOptionsMutableBuilder[Self <: SaveDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultUri(value: Uri): Self = StObject.set(x, "defaultUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUriUndefined: Self = StObject.set(x, "defaultUri", js.undefined)
    
    @scala.inline
    def setFilters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setSaveLabel(value: String): Self = StObject.set(x, "saveLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveLabelUndefined: Self = StObject.set(x, "saveLabel", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
