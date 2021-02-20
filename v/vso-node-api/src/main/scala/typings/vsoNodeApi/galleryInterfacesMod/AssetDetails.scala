package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetDetails extends StObject {
  
  /**
    * Gets or sets the Answers, which contains vs marketplace extension name and publisher name
    */
  var answers: Answers = js.native
  
  /**
    * Gets or sets the VS publisher Id
    */
  var publisherNaturalIdentifier: String = js.native
}
object AssetDetails {
  
  @scala.inline
  def apply(answers: Answers, publisherNaturalIdentifier: String): AssetDetails = {
    val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any], publisherNaturalIdentifier = publisherNaturalIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDetails]
  }
  
  @scala.inline
  implicit class AssetDetailsMutableBuilder[Self <: AssetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswers(value: Answers): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNaturalIdentifier(value: String): Self = StObject.set(x, "publisherNaturalIdentifier", value.asInstanceOf[js.Any])
  }
}
