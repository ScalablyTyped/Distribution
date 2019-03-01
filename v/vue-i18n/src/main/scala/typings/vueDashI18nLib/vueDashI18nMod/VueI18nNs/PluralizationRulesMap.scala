package typings
package vueDashI18nLib.vueDashI18nMod.VueI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralizationRulesMap
  extends /**
  * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
  * @param choicesLength {number} an overall amount of available choices
  * @returns a final choice index
  */
/* lang */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* choice */ scala.Double, /* choicesLength */ scala.Double, scala.Double]
    ]

object PluralizationRulesMap {
  @scala.inline
  def apply(
    StringDictionary: /**
    * @param choice {number} a choice index given by the input to $tc: `$tc('path.to.rule', choiceIndex)`
    * @param choicesLength {number} an overall amount of available choices
    * @returns a final choice index
    */
  /* lang */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* choice */ scala.Double, /* choicesLength */ scala.Double, scala.Double]
    ] = null
  ): PluralizationRulesMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PluralizationRulesMap]
  }
}

