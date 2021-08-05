package typings.wdioUtils

import org.scalablytyped.runtime.StringDictionary
import typings.wdioUtils.anon.Call
import typings.wdioUtils.anon.Value
import typings.wdioUtils.anon.ValueRecord
import typings.wdioUtils.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monadMod {
  
  @JSImport("@wdio/utils/build/monad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any
  ): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def default(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    modifier: js.Function
  ): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def default(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    modifier: js.Function,
    propertiesObject: PropertiesObject
  ): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def default(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Options */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Config */ js.Any,
    modifier: Unit,
    propertiesObject: PropertiesObject
  ): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  trait PropertiesObject
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var commandList: js.UndefOr[Value] = js.undefined
    
    var options: js.UndefOr[ValueRecord] = js.undefined
    
    var puppeteer: js.UndefOr[js.Any] = js.undefined
    
    var requestedCapabilities: js.UndefOr[`0`] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object PropertiesObject {
    
    inline def apply(): PropertiesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertiesObject]
    }
    
    extension [Self <: PropertiesObject](x: Self) {
      
      inline def setCommandList(value: Value): Self = StObject.set(x, "commandList", value.asInstanceOf[js.Any])
      
      inline def setCommandListUndefined: Self = StObject.set(x, "commandList", js.undefined)
      
      inline def setOptions(value: ValueRecord): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPuppeteer(value: js.Any): Self = StObject.set(x, "puppeteer", value.asInstanceOf[js.Any])
      
      inline def setPuppeteerUndefined: Self = StObject.set(x, "puppeteer", js.undefined)
      
      inline def setRequestedCapabilities(value: `0`): Self = StObject.set(x, "requestedCapabilities", value.asInstanceOf[js.Any])
      
      inline def setRequestedCapabilitiesUndefined: Self = StObject.set(x, "requestedCapabilities", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
