package typings.stylableCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "processorWarnings")
@js.native
object processorWarnings extends js.Object {
  
  def CANNOT_EXTEND_IN_COMPLEX(): String = js.native
  
  def CANNOT_RESOLVE_EXTEND(name: String): String = js.native
  
  def DEFAULT_IMPORT_IS_LOWER_CASE(): String = js.native
  
  def EMPTY_IMPORT_FROM(): String = js.native
  
  def EMPTY_NAMESPACE_DEF(): String = js.native
  
  def FORBIDDEN_DEF_IN_COMPLEX_SELECTOR(name: String): String = js.native
  
  def FROM_PROP_MISSING_IN_IMPORT(): String = js.native
  
  def GLOBAL_CSS_VAR_MISSING_COMMA(name: String): String = js.native
  
  def ILLEGAL_CSS_VAR_ARGS(name: String): String = js.native
  
  def ILLEGAL_CSS_VAR_USE(name: String): String = js.native
  
  def ILLEGAL_GLOBAL_CSS_VAR(name: String): String = js.native
  
  def ILLEGAL_PROP_IN_IMPORT(propName: String): String = js.native
  
  def INVALID_NAMESPACE_DEF(): String = js.native
  
  def MISSING_SCOPING_PARAM(): String = js.native
  
  def MULTIPLE_FROM_IN_IMPORT(): String = js.native
  
  def NO_IMPORT_IN_ST_SCOPE(): String = js.native
  
  def NO_KEYFRAMES_IN_ST_SCOPE(): String = js.native
  
  def NO_VARS_DEF_IN_ST_SCOPE(): String = js.native
  
  def OVERRIDE_MIXIN(mixinType: String): String = js.native
  
  def OVERRIDE_TYPED_RULE(key: String, name: String): String = js.native
  
  def PARTIAL_MIXIN_MISSING_ARGUMENTS(`type`: String): String = js.native
  
  def REDECLARE_SYMBOL(name: String): String = js.native
  
  def REDECLARE_SYMBOL_KEYFRAMES(name: String): String = js.native
  
  def ROOT_AFTER_SPACING(): String = js.native
  
  def STATE_DEFINITION_IN_COMPLEX(): String = js.native
  
  def STATE_DEFINITION_IN_ELEMENT(): String = js.native
  
  def UNKNOWN_MIXIN(name: String): String = js.native
  
  def UNSCOPED_CLASS(name: String): String = js.native
  
  def UNSCOPED_ELEMENT(name: String): String = js.native
}
