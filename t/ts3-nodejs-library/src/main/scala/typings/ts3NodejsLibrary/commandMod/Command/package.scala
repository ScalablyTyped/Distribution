package typings.ts3NodejsLibrary.commandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Command {
  type ParserCallback = js.Function1[
    /* parser */ typings.ts3NodejsLibrary.commandMod.Command.Parsers, 
    typings.ts3NodejsLibrary.commandMod.Command.Parsers
  ]
  type RequestParser = js.Function1[/* cmd */ typings.ts3NodejsLibrary.commandMod.Command, java.lang.String]
  type ResponseParser = js.Function1[
    /* data */ typings.ts3NodejsLibrary.commandMod.Command.ParserArgument, 
    typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
  ]
  type flags = js.Array[scala.Double | java.lang.String | scala.Null]
  type multiOpts = js.Array[typings.ts3NodejsLibrary.commandMod.Command.options]
  type options = typings.std.Record[
    java.lang.String, 
    typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ValueTypes
  ]
}
