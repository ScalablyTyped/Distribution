package typings.typedoc.distLibUtilsOptionsHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterHelp extends js.Object {
  var helps: js.Array[String]
  var margin: Double
  var names: js.Array[String]
}

object ParameterHelp {
  @scala.inline
  def apply(helps: js.Array[String], margin: Double, names: js.Array[String]): ParameterHelp = {
    val __obj = js.Dynamic.literal(helps = helps.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParameterHelp]
  }
}

