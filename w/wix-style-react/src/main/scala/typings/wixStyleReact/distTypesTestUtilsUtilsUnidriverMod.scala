package typings.wixStyleReact

import typings.wixStyleReact.anon.BeforeInput
import typings.wixStyleReact.anon.ClickElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsUnidriverMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/unidriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ReactBase {
    
    inline def apply(
      base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any
    ): BeforeInput = ^.asInstanceOf[js.Dynamic].apply(base.asInstanceOf[js.Any]).asInstanceOf[BeforeInput]
    
    @JSImport("wix-style-react/dist/types/test-utils/utils/unidriver", "ReactBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clickBody(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clickBody")().asInstanceOf[Boolean]
    
    inline def clickDocument(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clickDocument")().asInstanceOf[Boolean]
  }
  
  inline def baseUniDriverFactory(base: Any): ClickElement = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ClickElement]
  
  inline def countByHook(
    base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any,
    hook: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("countByHook")(base.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def findByHook(
    base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any,
    hook: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findByHook")(base.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def findByHookAtIndex(
    base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any,
    hook: String,
    index: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findByHookAtIndex")(base.asInstanceOf[js.Any], hook.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDataAttributeValue(
    base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any,
    attr: String
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataAttributeValue")(base.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def getElement(
    base: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any
  ): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(base.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def isElementFocused(
    element: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniDriver */ Any
  ): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocused")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
