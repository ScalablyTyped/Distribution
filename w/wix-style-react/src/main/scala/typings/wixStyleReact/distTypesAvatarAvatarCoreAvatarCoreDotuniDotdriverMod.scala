package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.distTypesAvatarAvatarCoreAvatarCoreMod.ContentType
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarAvatarCoreAvatarCoreDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Avatar/AvatarCore/AvatarCore.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avatarCoreDriverFactory(base: UniDriver[Any]): AvatarCoreDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarCoreDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AvatarCoreDriver]
  
  @js.native
  trait AvatarCoreDriver
    extends StObject
       with BaseUniDriver {
    
    /** Get the attribute value */
    def getAttribute(attrName: String): js.Promise[String | Null] = js.native
    def getAttribute(attrName: String, dataHook: String): js.Promise[String | Null] = js.native
    
    /** Get the currently displayed type. Types are: 'text', 'icon', 'image'. It could be that the resolved type is 'image' but the currently displayed one is `text`. */
    def getContentType(): js.Promise[ContentType] = js.native
    
    /** Get the property value */
    def getProperty(propName: String): js.Promise[String | Null] = js.native
    
    /** Get the text content (generated initials) */
    def getTextContent(): js.Promise[String] = js.native
    def getTextContent(dataHook: String): js.Promise[String] = js.native
    
    def hasClass(className: String): js.Promise[Boolean] = js.native
    def hasClass(className: String, dataHook: String): js.Promise[Boolean] = js.native
    
    /** Wether the image wass loaded */
    def isImageLoaded(): js.Promise[Boolean] = js.native
  }
}
