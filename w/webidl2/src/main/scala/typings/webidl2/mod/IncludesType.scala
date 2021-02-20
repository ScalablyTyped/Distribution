package typings.webidl2.mod

import typings.webidl2.webidl2Strings.includes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludesType
  extends AbstractBase
     with IDLRootType {
  
  /** The interface mixin that is being included by the target. */
  var includes: String = js.native
  
  @JSName("parent")
  var parent_IncludesType: Null = js.native
  
  /** The interface that includes an interface mixin. */
  var target: String = js.native
  
  @JSName("type")
  var type_IncludesType: includes = js.native
}
object IncludesType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    includes: String,
    parent: Null,
    target: String,
    `type`: includes
  ): IncludesType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludesType]
  }
  
  @scala.inline
  implicit class IncludesTypeMutableBuilder[Self <: IncludesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludes(value: String): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: includes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
