package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationGeneratorFactory extends js.Object {
  def createSyndicationGenerator(text: java.lang.String): SyndicationGenerator
}

object ISyndicationGeneratorFactory {
  @scala.inline
  def apply(createSyndicationGenerator: java.lang.String => SyndicationGenerator): ISyndicationGeneratorFactory = {
    val __obj = js.Dynamic.literal(createSyndicationGenerator = js.Any.fromFunction1(createSyndicationGenerator))
  
    __obj.asInstanceOf[ISyndicationGeneratorFactory]
  }
}

