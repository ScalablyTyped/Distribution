package typings.webdriverio.anon

import typings.wdioTypes.buildOptionsMod.WebdriverIO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandList extends StObject {
  
  var commandList: js.Array[
    /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269, starting with typings.webdriverio.webdriverioStrings.getSessionStorage, typings.webdriverio.webdriverioStrings.getGeoLocation, typings.webdriverio.webdriverioStrings.getElementLocationInView */ Any
  ]
  
  var options: WebdriverIO
}
object CommandList {
  
  inline def apply(
    commandList: js.Array[
      /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269, starting with typings.webdriverio.webdriverioStrings.getSessionStorage, typings.webdriverio.webdriverioStrings.getGeoLocation, typings.webdriverio.webdriverioStrings.getElementLocationInView */ Any
    ],
    options: WebdriverIO
  ): CommandList = {
    val __obj = js.Dynamic.literal(commandList = commandList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandList]
  }
  
  extension [Self <: CommandList](x: Self) {
    
    inline def setCommandList(
      value: js.Array[
          /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269, starting with typings.webdriverio.webdriverioStrings.getSessionStorage, typings.webdriverio.webdriverioStrings.getGeoLocation, typings.webdriverio.webdriverioStrings.getElementLocationInView */ Any
        ]
    ): Self = StObject.set(x, "commandList", value.asInstanceOf[js.Any])
    
    inline def setCommandListVarargs(
      value: (/* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269, starting with typings.webdriverio.webdriverioStrings.getSessionStorage, typings.webdriverio.webdriverioStrings.getGeoLocation, typings.webdriverio.webdriverioStrings.getElementLocationInView */ Any)*
    ): Self = StObject.set(x, "commandList", js.Array(value*))
    
    inline def setOptions(value: WebdriverIO): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
