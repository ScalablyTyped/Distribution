package typings.titanium

import typings.titanium.Titanium.Contacts.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object of options for <Titanium.UI.iOS.ApplicationShortcuts.addDynamicShortcut>.
  */
@js.native
trait ShortcutParams extends StObject {
  
  /**
    * The icon to be displayed on the application shortcut. You can either use one of the constants like
    * <Titanium.UI.iOS.SHORTCUT_ICON_TYPE_COMPOSE>, a local image specified by the image path or a reference to a
    * <Titanium.Contacts.Person>.
    */
  var icon: js.UndefOr[Double | String | Person] = js.native
  
  /**
    * The unique key for the application shortcut. Equates to the underlying `UIApplicationShortcutItemIconType` key
    */
  var identifier: String = js.native
  
  /**
    * The subtitle displayed on the application shortcut.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * The title of the application shortcut.
    */
  var title: String = js.native
  
  /**
    * The userInfo of the application shortcut.
    */
  var userInfo: js.UndefOr[js.Any] = js.native
}
object ShortcutParams {
  
  @scala.inline
  def apply(identifier: String, title: String): ShortcutParams = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutParams]
  }
  
  @scala.inline
  implicit class ShortcutParamsMutableBuilder[Self <: ShortcutParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: Double | String | Person): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: js.Any): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
