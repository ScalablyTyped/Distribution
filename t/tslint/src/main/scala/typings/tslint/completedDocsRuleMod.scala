package typings.tslint

import typings.tslint.anon.PropertiesLocations
import typings.tslint.anon.PropertiesOverloads
import typings.tslint.anon.PropertiesPrivacies
import typings.tslint.anon.PropertiesType
import typings.tslint.anon.PropertiesVisibilities
import typings.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/completedDocsRule", JSImport.Namespace)
@js.native
object completedDocsRuleMod extends js.Object {
  
  @JSName("ALL")
  val ALL_ : /* "all" */ String = js.native
  
  val ARGUMENT_CLASSES: /* "classes" */ String = js.native
  
  val ARGUMENT_CONSTRUCTORS: /* "constructors" */ String = js.native
  
  val ARGUMENT_ENUMS: /* "enums" */ String = js.native
  
  val ARGUMENT_ENUM_MEMBERS: /* "enum-members" */ String = js.native
  
  val ARGUMENT_FUNCTIONS: /* "functions" */ String = js.native
  
  val ARGUMENT_INTERFACES: /* "interfaces" */ String = js.native
  
  val ARGUMENT_METHODS: /* "methods" */ String = js.native
  
  val ARGUMENT_NAMESPACES: /* "namespaces" */ String = js.native
  
  val ARGUMENT_PROPERTIES: /* "properties" */ String = js.native
  
  val ARGUMENT_TYPES: /* "types" */ String = js.native
  
  val ARGUMENT_VARIABLES: /* "variables" */ String = js.native
  
  val DESCRIPTOR_LOCATIONS: /* "locations" */ String = js.native
  
  val DESCRIPTOR_OVERLOADS: /* "overloads" */ String = js.native
  
  val DESCRIPTOR_PRIVACIES: /* "privacies" */ String = js.native
  
  val DESCRIPTOR_TAGS: /* "tags" */ String = js.native
  
  val DESCRIPTOR_VISIBILITIES: /* "visibilities" */ String = js.native
  
  val LOCATION_INSTANCE: /* "instance" */ String = js.native
  
  val LOCATION_STATIC: /* "static" */ String = js.native
  
  val PRIVACY_PRIVATE: /* "private" */ String = js.native
  
  val PRIVACY_PROTECTED: /* "protected" */ String = js.native
  
  val PRIVACY_PUBLIC: /* "public" */ String = js.native
  
  val TAGS_FOR_CONTENT: /* "content" */ String = js.native
  
  val TAGS_FOR_EXISTENCE: /* "existence" */ String = js.native
  
  val VISIBILITY_EXPORTED: /* "exported" */ String = js.native
  
  val VISIBILITY_INTERNAL: /* "internal" */ String = js.native
  
  @js.native
  class Rule () extends AbstractRule {
    
    var getExclusionsMap: js.Any = js.native
  }
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var ARGUMENT_DESCRIPTOR_BLOCK: PropertiesType = js.native
    
    var ARGUMENT_DESCRIPTOR_CLASS: PropertiesLocations = js.native
    
    var ARGUMENT_DESCRIPTOR_CONSTRUCTOR: PropertiesOverloads = js.native
    
    var ARGUMENT_DESCRIPTOR_FUNCTION: PropertiesVisibilities = js.native
    
    var ARGUMENT_DESCRIPTOR_METHOD: PropertiesPrivacies = js.native
    
    var FAILURE_STRING_EXIST: String = js.native
    
    var defaultArguments: IInputExclusionDescriptors = js.native
    
    var metadata: IRuleMetadata = js.native
  }
  
  type All = /* "all" */ String
  
  type DocType = All | (/* "classes" */ String)
  
  type Location = All | (/* "instance" */ String)
  
  type Privacy = All | (/* "private" */ String)
  
  type Visibility = All | (/* "exported" */ String)
}
