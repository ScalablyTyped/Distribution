package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationGeneratorFactory extends js.Object {
  
  def createSyndicationGenerator(text: String): SyndicationGenerator = js.native
}
object ISyndicationGeneratorFactory {
  
  @scala.inline
  def apply(createSyndicationGenerator: String => SyndicationGenerator): ISyndicationGeneratorFactory = {
    val __obj = js.Dynamic.literal(createSyndicationGenerator = js.Any.fromFunction1(createSyndicationGenerator))
    __obj.asInstanceOf[ISyndicationGeneratorFactory]
  }
  
  @scala.inline
  implicit class ISyndicationGeneratorFactoryOps[Self <: ISyndicationGeneratorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateSyndicationGenerator(value: String => SyndicationGenerator): Self = this.set("createSyndicationGenerator", js.Any.fromFunction1(value))
  }
}
