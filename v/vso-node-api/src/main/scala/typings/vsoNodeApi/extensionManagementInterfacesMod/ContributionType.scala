package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributionType extends ContributionBase {
  
  /**
    * Controls whether or not contributions of this type have the type indexed for queries. This allows clients to find all extensions that have a contribution of this type.  NOTE: Only TrustedPartners are allowed to specify indexed contribution types.
    */
  var indexed: Boolean = js.native
  
  /**
    * Friendly name of the contribution/type
    */
  var name: String = js.native
  
  /**
    * Describes the allowed properties for this contribution type
    */
  var properties: StringDictionary[ContributionPropertyDescription] = js.native
}
object ContributionType {
  
  @scala.inline
  def apply(
    description: String,
    id: String,
    indexed: Boolean,
    name: String,
    properties: StringDictionary[ContributionPropertyDescription],
    visibleTo: js.Array[String]
  ): ContributionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indexed = indexed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], visibleTo = visibleTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionType]
  }
  
  @scala.inline
  implicit class ContributionTypeMutableBuilder[Self <: ContributionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[ContributionPropertyDescription]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
