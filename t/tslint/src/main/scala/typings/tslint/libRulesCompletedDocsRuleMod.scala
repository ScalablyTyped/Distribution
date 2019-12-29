package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.IInputExclusionDescriptors
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.tslint.tslintStrings.`enum-members`
import typings.tslint.tslintStrings.`private`
import typings.tslint.tslintStrings.`protected`
import typings.tslint.tslintStrings.all
import typings.tslint.tslintStrings.classes
import typings.tslint.tslintStrings.content
import typings.tslint.tslintStrings.enums
import typings.tslint.tslintStrings.existence
import typings.tslint.tslintStrings.exported
import typings.tslint.tslintStrings.functions
import typings.tslint.tslintStrings.instance
import typings.tslint.tslintStrings.interfaces
import typings.tslint.tslintStrings.internal
import typings.tslint.tslintStrings.locations
import typings.tslint.tslintStrings.methods
import typings.tslint.tslintStrings.namespaces
import typings.tslint.tslintStrings.overloads
import typings.tslint.tslintStrings.privacies
import typings.tslint.tslintStrings.properties
import typings.tslint.tslintStrings.public
import typings.tslint.tslintStrings.static
import typings.tslint.tslintStrings.tags
import typings.tslint.tslintStrings.types
import typings.tslint.tslintStrings.variables
import typings.tslint.tslintStrings.visibilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completedDocsRule", JSImport.Namespace)
@js.native
object libRulesCompletedDocsRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule {
    var getExclusionsMap: js.Any = js.native
  }
  
  trait _DocType extends js.Object
  
  trait _Location extends js.Object
  
  trait _Privacy extends js.Object
  
  trait _Visibility extends js.Object
  
  val ALL: all = js.native
  val ARGUMENT_CLASSES: classes = js.native
  val ARGUMENT_ENUMS: enums = js.native
  val ARGUMENT_ENUM_MEMBERS: `enum-members` = js.native
  val ARGUMENT_FUNCTIONS: functions = js.native
  val ARGUMENT_INTERFACES: interfaces = js.native
  val ARGUMENT_METHODS: methods = js.native
  val ARGUMENT_NAMESPACES: namespaces = js.native
  val ARGUMENT_PROPERTIES: properties = js.native
  val ARGUMENT_TYPES: types = js.native
  val ARGUMENT_VARIABLES: variables = js.native
  val DESCRIPTOR_LOCATIONS: locations = js.native
  val DESCRIPTOR_OVERLOADS: overloads = js.native
  val DESCRIPTOR_PRIVACIES: privacies = js.native
  val DESCRIPTOR_TAGS: tags = js.native
  val DESCRIPTOR_VISIBILITIES: visibilities = js.native
  val LOCATION_INSTANCE: instance = js.native
  val LOCATION_STATIC: static = js.native
  val PRIVACY_PRIVATE: `private` = js.native
  val PRIVACY_PROTECTED: `protected` = js.native
  val PRIVACY_PUBLIC: public = js.native
  val TAGS_FOR_CONTENT: content = js.native
  val TAGS_FOR_EXISTENCE: existence = js.native
  val VISIBILITY_EXPORTED: exported = js.native
  val VISIBILITY_INTERNAL: internal = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var ARGUMENT_DESCRIPTOR_BLOCK: Anon_PropertiesType = js.native
    var ARGUMENT_DESCRIPTOR_CLASS: Anon_PropertiesTypeAnonLocations = js.native
    var ARGUMENT_DESCRIPTOR_FUNCTION: Anon_PropertiesTypeAnonOverloads = js.native
    var ARGUMENT_DESCRIPTOR_METHOD: Anon_PropertiesTypeAnonLocationsOverloads = js.native
    var FAILURE_STRING_EXIST: String = js.native
    var defaultArguments: IInputExclusionDescriptors = js.native
    var metadata: IRuleMetadata = js.native
  }
  
  type All = all
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.classes
    - typings.tslint.tslintStrings.enums
    - typings.tslint.tslintStrings.`enum-members`
    - typings.tslint.tslintStrings.functions
    - typings.tslint.tslintStrings.interfaces
    - typings.tslint.tslintStrings.methods
    - typings.tslint.tslintStrings.namespaces
    - typings.tslint.tslintStrings.properties
    - typings.tslint.tslintStrings.types
    - typings.tslint.tslintStrings.variables
  */
  type DocType = _DocType | All
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.instance
    - typings.tslint.tslintStrings.static
  */
  type Location = _Location | All
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.`private`
    - typings.tslint.tslintStrings.`protected`
    - typings.tslint.tslintStrings.public
  */
  type Privacy = _Privacy | All
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.libRulesCompletedDocsRuleMod.All
    - typings.tslint.tslintStrings.exported
    - typings.tslint.tslintStrings.internal
  */
  type Visibility = _Visibility | All
}

