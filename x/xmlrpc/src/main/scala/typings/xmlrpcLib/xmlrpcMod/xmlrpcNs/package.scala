package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlrpcNs {
  type ServerFunction = js.Function3[
    /* error */ js.Any, 
    /* params */ js.Any, 
    /* callback */ js.Function2[/* error */ js.Any, /* value */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type ServerNotFoundFunction = js.Function2[/* methodName */ java.lang.String, /* params */ js.Array[js.Any], scala.Unit]
}
