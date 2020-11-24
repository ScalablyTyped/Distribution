package typings.typeorm.typingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollationDocument extends js.Object {
  
  var alternate: js.UndefOr[String] = js.native
  
  var backwards: js.UndefOr[Boolean] = js.native
  
  var caseFirst: js.UndefOr[String] = js.native
  
  var caseLevel: js.UndefOr[Boolean] = js.native
  
  var locale: String = js.native
  
  var maxVariable: js.UndefOr[String] = js.native
  
  var normalization: js.UndefOr[Boolean] = js.native
  
  var numericOrdering: js.UndefOr[Boolean] = js.native
  
  var strength: js.UndefOr[scala.Double] = js.native
}
object CollationDocument {
  
  @scala.inline
  def apply(locale: String): CollationDocument = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollationDocument]
  }
  
  @scala.inline
  implicit class CollationDocumentOps[Self <: CollationDocument] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate(value: String): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate: Self = this.set("alternate", js.undefined)
    
    @scala.inline
    def setBackwards(value: Boolean): Self = this.set("backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackwards: Self = this.set("backwards", js.undefined)
    
    @scala.inline
    def setCaseFirst(value: String): Self = this.set("caseFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseFirst: Self = this.set("caseFirst", js.undefined)
    
    @scala.inline
    def setCaseLevel(value: Boolean): Self = this.set("caseLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseLevel: Self = this.set("caseLevel", js.undefined)
    
    @scala.inline
    def setMaxVariable(value: String): Self = this.set("maxVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVariable: Self = this.set("maxVariable", js.undefined)
    
    @scala.inline
    def setNormalization(value: Boolean): Self = this.set("normalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalization: Self = this.set("normalization", js.undefined)
    
    @scala.inline
    def setNumericOrdering(value: Boolean): Self = this.set("numericOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericOrdering: Self = this.set("numericOrdering", js.undefined)
    
    @scala.inline
    def setStrength(value: scala.Double): Self = this.set("strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
  }
}
