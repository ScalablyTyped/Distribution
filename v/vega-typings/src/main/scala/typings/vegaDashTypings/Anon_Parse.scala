package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecDataMod.Format
import typings.vegaDashTypings.typesSpecDataMod.Parse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parse extends Format {
  var parse: Parse
}

object Anon_Parse {
  @scala.inline
  def apply(parse: Parse): Anon_Parse = {
    val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Parse]
  }
}

