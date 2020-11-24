package typings.ts3NodejsLibrary.teamSpeakQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object TeamSpeakQuery {
  
  type Response = js.Array[typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry]
  
  type ValueTypes = js.UndefOr[
    scala.Boolean | java.lang.String | (js.Array[scala.Double | java.lang.String]) | scala.Double | typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
  ]
  
  type executeArgs = typings.ts3NodejsLibrary.commandMod.Command.ParserCallback | typings.ts3NodejsLibrary.commandMod.Command.multiOpts | typings.ts3NodejsLibrary.commandMod.Command.options | typings.ts3NodejsLibrary.commandMod.Command.flags
}
