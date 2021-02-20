package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Summary of the document usage statistics for the environment. */
@js.native
trait EnvironmentDocuments extends StObject {
  
  /** Number of documents indexed for the environment. */
  var indexed: js.UndefOr[Double] = js.native
  
  /** Total number of documents allowed in the environment's capacity. */
  var maximum_allowed: js.UndefOr[Double] = js.native
}
object EnvironmentDocuments {
  
  @scala.inline
  def apply(): EnvironmentDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentDocuments]
  }
  
  @scala.inline
  implicit class EnvironmentDocumentsMutableBuilder[Self <: EnvironmentDocuments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexed(value: Double): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    @scala.inline
    def setMaximum_allowed(value: Double): Self = StObject.set(x, "maximum_allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum_allowedUndefined: Self = StObject.set(x, "maximum_allowed", js.undefined)
  }
}
