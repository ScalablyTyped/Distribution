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
    js.Array[typings.ts3NodejsLibrary.queryResponseMod.QueryResponse]
  ]
  type flags = js.Array[scala.Double | java.lang.String | scala.Null]
  type multiOpts = js.Array[typings.ts3NodejsLibrary.commandMod.Command.options]
  type options = typings.std.Record[
    java.lang.String, 
    js.UndefOr[
      java.lang.String | (js.Array[scala.Double | java.lang.String]) | scala.Double | scala.Null
    ]
  ]
}
