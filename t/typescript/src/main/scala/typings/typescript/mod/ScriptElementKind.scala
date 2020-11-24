package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends js.Object
@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind with java.lang.String] = js.native
  
  @js.native
  sealed trait alias extends ScriptElementKind
  /* "alias" */ @js.native
  object alias
    extends TopLevel[alias with java.lang.String]
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement extends ScriptElementKind
  /* "call" */ @js.native
  object callSignatureElement
    extends TopLevel[callSignatureElement with java.lang.String]
  
  /** class X {} */
  @js.native
  sealed trait classElement extends ScriptElementKind
  /* "class" */ @js.native
  object classElement
    extends TopLevel[classElement with java.lang.String]
  
  @js.native
  sealed trait constElement extends ScriptElementKind
  /* "const" */ @js.native
  object constElement
    extends TopLevel[constElement with java.lang.String]
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement extends ScriptElementKind
  /* "construct" */ @js.native
  object constructSignatureElement
    extends TopLevel[constructSignatureElement with java.lang.String]
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement extends ScriptElementKind
  /* "constructor" */ @js.native
  object constructorImplementationElement
    extends TopLevel[constructorImplementationElement with java.lang.String]
  
  @js.native
  sealed trait directory extends ScriptElementKind
  /* "directory" */ @js.native
  object directory
    extends TopLevel[directory with java.lang.String]
  
  /** enum E */
  @js.native
  sealed trait enumElement extends ScriptElementKind
  /* "enum" */ @js.native
  object enumElement
    extends TopLevel[enumElement with java.lang.String]
  
  @js.native
  sealed trait enumMemberElement extends ScriptElementKind
  /* "enum member" */ @js.native
  object enumMemberElement
    extends TopLevel[enumMemberElement with java.lang.String]
  
  @js.native
  sealed trait externalModuleName extends ScriptElementKind
  /* "external module name" */ @js.native
  object externalModuleName
    extends TopLevel[externalModuleName with java.lang.String]
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement extends ScriptElementKind
  /* "function" */ @js.native
  object functionElement
    extends TopLevel[functionElement with java.lang.String]
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement extends ScriptElementKind
  /* "index" */ @js.native
  object indexSignatureElement
    extends TopLevel[indexSignatureElement with java.lang.String]
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement extends ScriptElementKind
  /* "interface" */ @js.native
  object interfaceElement
    extends TopLevel[interfaceElement with java.lang.String]
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute extends ScriptElementKind
  /* "JSX attribute" */ @js.native
  object jsxAttribute
    extends TopLevel[jsxAttribute with java.lang.String]
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword extends ScriptElementKind
  /* "keyword" */ @js.native
  object keyword
    extends TopLevel[keyword with java.lang.String]
  
  @js.native
  sealed trait label extends ScriptElementKind
  /* "label" */ @js.native
  object label
    extends TopLevel[label with java.lang.String]
  
  @js.native
  sealed trait letElement extends ScriptElementKind
  /* "let" */ @js.native
  object letElement
    extends TopLevel[letElement with java.lang.String]
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement extends ScriptElementKind
  /* "local class" */ @js.native
  object localClassElement
    extends TopLevel[localClassElement with java.lang.String]
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement extends ScriptElementKind
  /* "local function" */ @js.native
  object localFunctionElement
    extends TopLevel[localFunctionElement with java.lang.String]
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement extends ScriptElementKind
  /* "local var" */ @js.native
  object localVariableElement
    extends TopLevel[localVariableElement with java.lang.String]
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement extends ScriptElementKind
  /* "method" */ @js.native
  object memberFunctionElement
    extends TopLevel[memberFunctionElement with java.lang.String]
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement extends ScriptElementKind
  /* "getter" */ @js.native
  object memberGetAccessorElement
    extends TopLevel[memberGetAccessorElement with java.lang.String]
  
  @js.native
  sealed trait memberSetAccessorElement extends ScriptElementKind
  /* "setter" */ @js.native
  object memberSetAccessorElement
    extends TopLevel[memberSetAccessorElement with java.lang.String]
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement extends ScriptElementKind
  /* "property" */ @js.native
  object memberVariableElement
    extends TopLevel[memberVariableElement with java.lang.String]
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement extends ScriptElementKind
  /* "module" */ @js.native
  object moduleElement
    extends TopLevel[moduleElement with java.lang.String]
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement extends ScriptElementKind
  /* "parameter" */ @js.native
  object parameterElement
    extends TopLevel[parameterElement with java.lang.String]
  
  @js.native
  sealed trait primitiveType extends ScriptElementKind
  /* "primitive type" */ @js.native
  object primitiveType
    extends TopLevel[primitiveType with java.lang.String]
  
  /** top level script node */
  @js.native
  sealed trait scriptElement extends ScriptElementKind
  /* "script" */ @js.native
  object scriptElement
    extends TopLevel[scriptElement with java.lang.String]
  
  /** String literal */
  @js.native
  sealed trait string extends ScriptElementKind
  /* "string" */ @js.native
  object string
    extends TopLevel[string with java.lang.String]
  
  /** type T = ... */
  @js.native
  sealed trait typeElement extends ScriptElementKind
  /* "type" */ @js.native
  object typeElement
    extends TopLevel[typeElement with java.lang.String]
  
  @js.native
  sealed trait typeParameterElement extends ScriptElementKind
  /* "type parameter" */ @js.native
  object typeParameterElement
    extends TopLevel[typeParameterElement with java.lang.String]
  
  @js.native
  sealed trait unknown extends ScriptElementKind
  /* "" */ @js.native
  object unknown
    extends TopLevel[unknown with java.lang.String]
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement extends ScriptElementKind
  /* "var" */ @js.native
  object variableElement
    extends TopLevel[variableElement with java.lang.String]
  
  @js.native
  sealed trait warning extends ScriptElementKind
  /* "warning" */ @js.native
  object warning
    extends TopLevel[warning with java.lang.String]
}
