package typings.typescript.typescriptMod

import org.scalablytyped.runtime.TopLevel
import typings.typescript.typescriptMod.ScriptElementKind.alias
import typings.typescript.typescriptMod.ScriptElementKind.callSignatureElement
import typings.typescript.typescriptMod.ScriptElementKind.classElement
import typings.typescript.typescriptMod.ScriptElementKind.constElement
import typings.typescript.typescriptMod.ScriptElementKind.constructSignatureElement
import typings.typescript.typescriptMod.ScriptElementKind.constructorImplementationElement
import typings.typescript.typescriptMod.ScriptElementKind.directory
import typings.typescript.typescriptMod.ScriptElementKind.enumElement
import typings.typescript.typescriptMod.ScriptElementKind.enumMemberElement
import typings.typescript.typescriptMod.ScriptElementKind.externalModuleName
import typings.typescript.typescriptMod.ScriptElementKind.functionElement
import typings.typescript.typescriptMod.ScriptElementKind.indexSignatureElement
import typings.typescript.typescriptMod.ScriptElementKind.interfaceElement
import typings.typescript.typescriptMod.ScriptElementKind.jsxAttribute
import typings.typescript.typescriptMod.ScriptElementKind.keyword
import typings.typescript.typescriptMod.ScriptElementKind.label
import typings.typescript.typescriptMod.ScriptElementKind.letElement
import typings.typescript.typescriptMod.ScriptElementKind.localClassElement
import typings.typescript.typescriptMod.ScriptElementKind.localFunctionElement
import typings.typescript.typescriptMod.ScriptElementKind.localVariableElement
import typings.typescript.typescriptMod.ScriptElementKind.memberFunctionElement
import typings.typescript.typescriptMod.ScriptElementKind.memberGetAccessorElement
import typings.typescript.typescriptMod.ScriptElementKind.memberSetAccessorElement
import typings.typescript.typescriptMod.ScriptElementKind.memberVariableElement
import typings.typescript.typescriptMod.ScriptElementKind.moduleElement
import typings.typescript.typescriptMod.ScriptElementKind.parameterElement
import typings.typescript.typescriptMod.ScriptElementKind.primitiveType
import typings.typescript.typescriptMod.ScriptElementKind.scriptElement
import typings.typescript.typescriptMod.ScriptElementKind.string
import typings.typescript.typescriptMod.ScriptElementKind.typeElement
import typings.typescript.typescriptMod.ScriptElementKind.typeParameterElement
import typings.typescript.typescriptMod.ScriptElementKind.unknown
import typings.typescript.typescriptMod.ScriptElementKind.variableElement
import typings.typescript.typescriptMod.ScriptElementKind.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKind extends js.Object

@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends js.Object {
  @js.native
  sealed trait alias extends ScriptElementKind
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement extends ScriptElementKind
  
  /** class X {} */
  @js.native
  sealed trait classElement extends ScriptElementKind
  
  @js.native
  sealed trait constElement extends ScriptElementKind
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement extends ScriptElementKind
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement extends ScriptElementKind
  
  @js.native
  sealed trait directory extends ScriptElementKind
  
  /** enum E */
  @js.native
  sealed trait enumElement extends ScriptElementKind
  
  @js.native
  sealed trait enumMemberElement extends ScriptElementKind
  
  @js.native
  sealed trait externalModuleName extends ScriptElementKind
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement extends ScriptElementKind
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement extends ScriptElementKind
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement extends ScriptElementKind
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute extends ScriptElementKind
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword extends ScriptElementKind
  
  @js.native
  sealed trait label extends ScriptElementKind
  
  @js.native
  sealed trait letElement extends ScriptElementKind
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement extends ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement extends ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement extends ScriptElementKind
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement extends ScriptElementKind
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement extends ScriptElementKind
  
  @js.native
  sealed trait memberSetAccessorElement extends ScriptElementKind
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement extends ScriptElementKind
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement extends ScriptElementKind
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement extends ScriptElementKind
  
  @js.native
  sealed trait primitiveType extends ScriptElementKind
  
  /** top level script node */
  @js.native
  sealed trait scriptElement extends ScriptElementKind
  
  /** String literal */
  @js.native
  sealed trait string extends ScriptElementKind
  
  /** type T = ... */
  @js.native
  sealed trait typeElement extends ScriptElementKind
  
  @js.native
  sealed trait typeParameterElement extends ScriptElementKind
  
  @js.native
  sealed trait unknown extends ScriptElementKind
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement extends ScriptElementKind
  
  @js.native
  sealed trait warning extends ScriptElementKind
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScriptElementKind with String] = js.native
  /* "alias" */ @js.native
  object alias extends TopLevel[alias with String]
  
  /* "call" */ @js.native
  object callSignatureElement extends TopLevel[callSignatureElement with String]
  
  /* "class" */ @js.native
  object classElement extends TopLevel[classElement with String]
  
  /* "const" */ @js.native
  object constElement extends TopLevel[constElement with String]
  
  /* "construct" */ @js.native
  object constructSignatureElement extends TopLevel[constructSignatureElement with String]
  
  /* "constructor" */ @js.native
  object constructorImplementationElement extends TopLevel[constructorImplementationElement with String]
  
  /* "directory" */ @js.native
  object directory extends TopLevel[directory with String]
  
  /* "enum" */ @js.native
  object enumElement extends TopLevel[enumElement with String]
  
  /* "enum member" */ @js.native
  object enumMemberElement extends TopLevel[enumMemberElement with String]
  
  /* "external module name" */ @js.native
  object externalModuleName extends TopLevel[externalModuleName with String]
  
  /* "function" */ @js.native
  object functionElement extends TopLevel[functionElement with String]
  
  /* "index" */ @js.native
  object indexSignatureElement extends TopLevel[indexSignatureElement with String]
  
  /* "interface" */ @js.native
  object interfaceElement extends TopLevel[interfaceElement with String]
  
  /* "JSX attribute" */ @js.native
  object jsxAttribute extends TopLevel[jsxAttribute with String]
  
  /* "keyword" */ @js.native
  object keyword extends TopLevel[keyword with String]
  
  /* "label" */ @js.native
  object label extends TopLevel[label with String]
  
  /* "let" */ @js.native
  object letElement extends TopLevel[letElement with String]
  
  /* "local class" */ @js.native
  object localClassElement extends TopLevel[localClassElement with String]
  
  /* "local function" */ @js.native
  object localFunctionElement extends TopLevel[localFunctionElement with String]
  
  /* "local var" */ @js.native
  object localVariableElement extends TopLevel[localVariableElement with String]
  
  /* "method" */ @js.native
  object memberFunctionElement extends TopLevel[memberFunctionElement with String]
  
  /* "getter" */ @js.native
  object memberGetAccessorElement extends TopLevel[memberGetAccessorElement with String]
  
  /* "setter" */ @js.native
  object memberSetAccessorElement extends TopLevel[memberSetAccessorElement with String]
  
  /* "property" */ @js.native
  object memberVariableElement extends TopLevel[memberVariableElement with String]
  
  /* "module" */ @js.native
  object moduleElement extends TopLevel[moduleElement with String]
  
  /* "parameter" */ @js.native
  object parameterElement extends TopLevel[parameterElement with String]
  
  /* "primitive type" */ @js.native
  object primitiveType extends TopLevel[primitiveType with String]
  
  /* "script" */ @js.native
  object scriptElement extends TopLevel[scriptElement with String]
  
  /* "string" */ @js.native
  object string extends TopLevel[string with String]
  
  /* "type" */ @js.native
  object typeElement extends TopLevel[typeElement with String]
  
  /* "type parameter" */ @js.native
  object typeParameterElement extends TopLevel[typeParameterElement with String]
  
  /* "" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
  /* "var" */ @js.native
  object variableElement extends TopLevel[variableElement with String]
  
  /* "warning" */ @js.native
  object warning extends TopLevel[warning with String]
  
}

