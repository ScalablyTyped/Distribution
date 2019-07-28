package typings.tslint.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplacementJson extends js.Object {
  var innerLength: Double
  var innerStart: Double
  var innerText: String
}

object ReplacementJson {
  @scala.inline
  def apply(innerLength: Double, innerStart: Double, innerText: String): ReplacementJson = {
    val __obj = js.Dynamic.literal(innerLength = innerLength, innerStart = innerStart, innerText = innerText)
  
    __obj.asInstanceOf[ReplacementJson]
  }
}

