package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionSourceProvider extends js.Object {
  
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  
  /**
    * fields associated with this build definition
    */
  var fields: StringDictionary[String] = js.native
  
  /**
    * Id of this source provider
    */
  var id: Double = js.native
  
  /**
    * The lst time this source provider was modified
    */
  var lastModified: Date = js.native
  
  /**
    * Name of the source provider
    */
  var name: String = js.native
  
  /**
    * Which trigger types are supported by this definition source provider
    */
  var supportedTriggerTypes: DefinitionTriggerType = js.native
}
object BuildDefinitionSourceProvider {
  
  @scala.inline
  def apply(
    definitionUri: String,
    fields: StringDictionary[String],
    id: Double,
    lastModified: Date,
    name: String,
    supportedTriggerTypes: DefinitionTriggerType
  ): BuildDefinitionSourceProvider = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedTriggerTypes = supportedTriggerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionSourceProvider]
  }
  
  @scala.inline
  implicit class BuildDefinitionSourceProviderOps[Self <: BuildDefinitionSourceProvider] (val x: Self) extends AnyVal {
    
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
    def setDefinitionUri(value: String): Self = this.set("definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTriggerTypes(value: DefinitionTriggerType): Self = this.set("supportedTriggerTypes", value.asInstanceOf[js.Any])
  }
}
