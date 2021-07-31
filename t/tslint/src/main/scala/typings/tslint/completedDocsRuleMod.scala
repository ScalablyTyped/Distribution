package typings.tslint

import typings.tslint.anon.PropertiesLocations
import typings.tslint.anon.PropertiesOverloads
import typings.tslint.anon.PropertiesPrivacies
import typings.tslint.anon.PropertiesType
import typings.tslint.anon.PropertiesVisibilities
import typings.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import typings.tslint.mod.Rules.AbstractRule
import typings.tslint.ruleMod.IOptions
import typings.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completedDocsRuleMod {
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ALL")
  @js.native
  val ALL_ : /* "all" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_CLASSES")
  @js.native
  val ARGUMENT_CLASSES: /* "classes" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_CONSTRUCTORS")
  @js.native
  val ARGUMENT_CONSTRUCTORS: /* "constructors" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_ENUMS")
  @js.native
  val ARGUMENT_ENUMS: /* "enums" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_ENUM_MEMBERS")
  @js.native
  val ARGUMENT_ENUM_MEMBERS: /* "enum-members" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_FUNCTIONS")
  @js.native
  val ARGUMENT_FUNCTIONS: /* "functions" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_INTERFACES")
  @js.native
  val ARGUMENT_INTERFACES: /* "interfaces" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_METHODS")
  @js.native
  val ARGUMENT_METHODS: /* "methods" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_NAMESPACES")
  @js.native
  val ARGUMENT_NAMESPACES: /* "namespaces" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_PROPERTIES")
  @js.native
  val ARGUMENT_PROPERTIES: /* "properties" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_TYPES")
  @js.native
  val ARGUMENT_TYPES: /* "types" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "ARGUMENT_VARIABLES")
  @js.native
  val ARGUMENT_VARIABLES: /* "variables" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "DESCRIPTOR_LOCATIONS")
  @js.native
  val DESCRIPTOR_LOCATIONS: /* "locations" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "DESCRIPTOR_OVERLOADS")
  @js.native
  val DESCRIPTOR_OVERLOADS: /* "overloads" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "DESCRIPTOR_PRIVACIES")
  @js.native
  val DESCRIPTOR_PRIVACIES: /* "privacies" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "DESCRIPTOR_TAGS")
  @js.native
  val DESCRIPTOR_TAGS: /* "tags" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "DESCRIPTOR_VISIBILITIES")
  @js.native
  val DESCRIPTOR_VISIBILITIES: /* "visibilities" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "LOCATION_INSTANCE")
  @js.native
  val LOCATION_INSTANCE: /* "instance" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "LOCATION_STATIC")
  @js.native
  val LOCATION_STATIC: /* "static" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "PRIVACY_PRIVATE")
  @js.native
  val PRIVACY_PRIVATE: /* "private" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "PRIVACY_PROTECTED")
  @js.native
  val PRIVACY_PROTECTED: /* "protected" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "PRIVACY_PUBLIC")
  @js.native
  val PRIVACY_PUBLIC: /* "public" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    var getExclusionsMap: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.ARGUMENT_DESCRIPTOR_BLOCK")
    @js.native
    def ARGUMENT_DESCRIPTOR_BLOCK: PropertiesType = js.native
    @scala.inline
    def ARGUMENT_DESCRIPTOR_BLOCK_=(x: PropertiesType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_BLOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.ARGUMENT_DESCRIPTOR_CLASS")
    @js.native
    def ARGUMENT_DESCRIPTOR_CLASS: PropertiesLocations = js.native
    @scala.inline
    def ARGUMENT_DESCRIPTOR_CLASS_=(x: PropertiesLocations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_CLASS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.ARGUMENT_DESCRIPTOR_CONSTRUCTOR")
    @js.native
    def ARGUMENT_DESCRIPTOR_CONSTRUCTOR: PropertiesOverloads = js.native
    @scala.inline
    def ARGUMENT_DESCRIPTOR_CONSTRUCTOR_=(x: PropertiesOverloads): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_CONSTRUCTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.ARGUMENT_DESCRIPTOR_FUNCTION")
    @js.native
    def ARGUMENT_DESCRIPTOR_FUNCTION: PropertiesVisibilities = js.native
    @scala.inline
    def ARGUMENT_DESCRIPTOR_FUNCTION_=(x: PropertiesVisibilities): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.ARGUMENT_DESCRIPTOR_METHOD")
    @js.native
    def ARGUMENT_DESCRIPTOR_METHOD: PropertiesPrivacies = js.native
    @scala.inline
    def ARGUMENT_DESCRIPTOR_METHOD_=(x: PropertiesPrivacies): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARGUMENT_DESCRIPTOR_METHOD")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.FAILURE_STRING_EXIST")
    @js.native
    def FAILURE_STRING_EXIST: String = js.native
    @scala.inline
    def FAILURE_STRING_EXIST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_EXIST")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.defaultArguments")
    @js.native
    def defaultArguments: IInputExclusionDescriptors = js.native
    @scala.inline
    def defaultArguments_=(x: IInputExclusionDescriptors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultArguments")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/completedDocsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("tslint/lib/rules/completedDocsRule", "TAGS_FOR_CONTENT")
  @js.native
  val TAGS_FOR_CONTENT: /* "content" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "TAGS_FOR_EXISTENCE")
  @js.native
  val TAGS_FOR_EXISTENCE: /* "existence" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "VISIBILITY_EXPORTED")
  @js.native
  val VISIBILITY_EXPORTED: /* "exported" */ String = js.native
  
  @JSImport("tslint/lib/rules/completedDocsRule", "VISIBILITY_INTERNAL")
  @js.native
  val VISIBILITY_INTERNAL: /* "internal" */ String = js.native
  
  type All = /* "all" */ String
  
  type DocType = All | (/* "classes" */ String)
  
  type Location = All | (/* "instance" */ String)
  
  type Privacy = All | (/* "private" */ String)
  
  type Visibility = All | (/* "exported" */ String)
}
