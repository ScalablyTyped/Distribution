package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statementdescriptor extends StObject {
  
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  
  /**
    * The Kana variation of the default text that appears on credit card statements
    * when a charge is made (Japan only)
    */
  var statement_descriptor_kana: js.UndefOr[String | Null] = js.native
  
  /**
    * The Kanji variation of the default text that appears on credit card statements
    * when a charge is made (Japan only)
    */
  var statement_descriptor_kanji: js.UndefOr[String | Null] = js.native
}
object Statementdescriptor {
  
  @scala.inline
  def apply(): Statementdescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statementdescriptor]
  }
  
  @scala.inline
  implicit class StatementdescriptorMutableBuilder[Self <: Statementdescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    @scala.inline
    def setStatement_descriptor_kana(value: String): Self = StObject.set(x, "statement_descriptor_kana", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor_kanaNull: Self = StObject.set(x, "statement_descriptor_kana", null)
    
    @scala.inline
    def setStatement_descriptor_kanaUndefined: Self = StObject.set(x, "statement_descriptor_kana", js.undefined)
    
    @scala.inline
    def setStatement_descriptor_kanji(value: String): Self = StObject.set(x, "statement_descriptor_kanji", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor_kanjiNull: Self = StObject.set(x, "statement_descriptor_kanji", null)
    
    @scala.inline
    def setStatement_descriptor_kanjiUndefined: Self = StObject.set(x, "statement_descriptor_kanji", js.undefined)
  }
}
