package typings.xmlrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlrpcMod {
  import org.scalablytyped.runtime.StringDictionary

  type Headers = StringDictionary[String]
  type ServerFunction = js.Function3[
    /* error */ js.Any, 
    /* params */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* value */ js.Any, Unit], 
    Unit
  ]
  type ServerNotFoundFunction = js.Function2[/* methodName */ String, /* params */ js.Array[js.Any], Unit]
}
