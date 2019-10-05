package typings.winrtDashUwp.Windows.Data.Text

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Permits apps to perform text queries using Advanced Query Syntax (AQS) strings, with the option of providing a language tag to be employed in the query. */
@JSGlobal("Windows.Data.Text.SemanticTextQuery")
@js.native
class SemanticTextQuery protected () extends js.Object {
  /**
    * Creates a SemanticTextQuery from an Advanced Query Syntax (AQS) query string.
    * @param aqsFilter An AQS string that contains the desired query. Learn more about AQS in Advanced Query Syntax (AQS).
    */
  def this(aqsFilter: String) = this()
  /**
    * Creates a SemanticTextQuery from an Advanced Query Syntax (AQS) query string and a language tag.
    * @param aqsFilter An AQS string that contains the desired query. Learn more about AQS in Advanced Query Syntax (AQS).
    * @param filterLanguage The BCP-47 language tag to be employed in the query.
    */
  def this(aqsFilter: String, filterLanguage: String) = this()
  /**
    * Returns segments of a source string that match the SemanticTextQuery object's query.
    * @param content A source string to be queried.
    * @return A collection of TextSegment structures that represent hits from the query.
    */
  def find(content: String): IVectorView[TextSegment] = js.native
  /**
    * Returns segments of a source string that match the SemanticTextQuery object's query over properties.
    * @param propertyContent A source string to be queried.
    * @param propertyName The name of the property.
    * @return A collection of TextSegment structures that represent hits from the query.
    */
  def findInProperty(propertyContent: String, propertyName: String): IVectorView[TextSegment] = js.native
}

