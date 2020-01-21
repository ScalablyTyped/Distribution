package typings.urlParse.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.urlParse.AnonParse
import typings.urlParse.AnonProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url-parse", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      (Instantiable1[/* address */ String, URLParse]) with (Instantiable2[/* address */ String, /* location */ String, URLParse]) with (Instantiable2[/* address */ String, /* location */ js.Object, URLParse]) with (Instantiable2[/* address */ String, /* parser */ Boolean, URLParse]) with (Instantiable2[/* address */ String, /* parser */ QueryParser, URLParse]) with (Instantiable3[/* address */ String, /* location */ String, /* parser */ Boolean, URLParse]) with (Instantiable3[/* address */ String, /* location */ String, /* parser */ QueryParser, URLParse]) with (Instantiable3[/* address */ String, /* location */ js.Object, /* parser */ Boolean, URLParse]) with (Instantiable3[/* address */ String, /* location */ js.Object, /* parser */ QueryParser, URLParse])
    ] {
  var qs: AnonParse = js.native
  def apply(address: String): URLParse = js.native
  def apply(address: String, location: String): URLParse = js.native
  def apply(address: String, location: String, parser: Boolean): URLParse = js.native
  def apply(address: String, location: String, parser: QueryParser): URLParse = js.native
  def apply(address: String, location: js.Object): URLParse = js.native
  def apply(address: String, location: js.Object, parser: Boolean): URLParse = js.native
  def apply(address: String, location: js.Object, parser: QueryParser): URLParse = js.native
  def apply(address: String, parser: Boolean): URLParse = js.native
  def apply(address: String, parser: QueryParser): URLParse = js.native
  def extractProtocol(url: String): AnonProtocol = js.native
  def location(url: String): js.Object = js.native
}

