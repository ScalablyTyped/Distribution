package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "CompositeFilter")
@js.native
open class CompositeFilter protected () extends AbstractFilter {
  def this(`type`: CompositeFilterType) = this()
  def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
  
  /**
    * The list of filters in the composite filter.
    */
  val filters: js.Array[AbstractFilter] = js.native
  
  /**
    * The composite filter type.
    */
  var `type`: CompositeFilterType = js.native
}
