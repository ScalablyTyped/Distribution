package typings.winkPosTagger.anon

import typings.winkPosTagger.winkPosTaggerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lemma extends js.Object {
  
  var lemma: `true` = js.native
  
  var normal: `true` = js.native
}
object Lemma {
  
  @scala.inline
  def apply(lemma: `true`, normal: `true`): Lemma = {
    val __obj = js.Dynamic.literal(lemma = lemma.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lemma]
  }
  
  @scala.inline
  implicit class LemmaOps[Self <: Lemma] (val x: Self) extends AnyVal {
    
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
    def setLemma(value: `true`): Self = this.set("lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: `true`): Self = this.set("normal", value.asInstanceOf[js.Any])
  }
}
