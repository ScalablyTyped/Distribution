package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScriptElementKind extends StObject
@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind & java.lang.String] = js.native
  
  @js.native
  sealed trait alias
    extends StObject
       with ScriptElementKind
  /* "alias" */ val alias: typings.typescript.mod.ScriptElementKind.alias & java.lang.String = js.native
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends StObject
       with ScriptElementKind
  /* "call" */ val callSignatureElement: typings.typescript.mod.ScriptElementKind.callSignatureElement & java.lang.String = js.native
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends StObject
       with ScriptElementKind
  /* "class" */ val classElement: typings.typescript.mod.ScriptElementKind.classElement & java.lang.String = js.native
  
  @js.native
  sealed trait constElement
    extends StObject
       with ScriptElementKind
  /* "const" */ val constElement: typings.typescript.mod.ScriptElementKind.constElement & java.lang.String = js.native
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends StObject
       with ScriptElementKind
  /* "construct" */ val constructSignatureElement: typings.typescript.mod.ScriptElementKind.constructSignatureElement & java.lang.String = js.native
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement
    extends StObject
       with ScriptElementKind
  /* "constructor" */ val constructorImplementationElement: typings.typescript.mod.ScriptElementKind.constructorImplementationElement & java.lang.String = js.native
  
  @js.native
  sealed trait directory
    extends StObject
       with ScriptElementKind
  /* "directory" */ val directory: typings.typescript.mod.ScriptElementKind.directory & java.lang.String = js.native
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends StObject
       with ScriptElementKind
  /* "enum" */ val enumElement: typings.typescript.mod.ScriptElementKind.enumElement & java.lang.String = js.native
  
  @js.native
  sealed trait enumMemberElement
    extends StObject
       with ScriptElementKind
  /* "enum member" */ val enumMemberElement: typings.typescript.mod.ScriptElementKind.enumMemberElement & java.lang.String = js.native
  
  @js.native
  sealed trait externalModuleName
    extends StObject
       with ScriptElementKind
  /* "external module name" */ val externalModuleName: typings.typescript.mod.ScriptElementKind.externalModuleName & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement
    extends StObject
       with ScriptElementKind
  /* "function" */ val functionElement: typings.typescript.mod.ScriptElementKind.functionElement & java.lang.String = js.native
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends StObject
       with ScriptElementKind
  /* "index" */ val indexSignatureElement: typings.typescript.mod.ScriptElementKind.indexSignatureElement & java.lang.String = js.native
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends StObject
       with ScriptElementKind
  /* "interface" */ val interfaceElement: typings.typescript.mod.ScriptElementKind.interfaceElement & java.lang.String = js.native
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute
    extends StObject
       with ScriptElementKind
  /* "JSX attribute" */ val jsxAttribute: typings.typescript.mod.ScriptElementKind.jsxAttribute & java.lang.String = js.native
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends StObject
       with ScriptElementKind
  /* "keyword" */ val keyword: typings.typescript.mod.ScriptElementKind.keyword & java.lang.String = js.native
  
  @js.native
  sealed trait label
    extends StObject
       with ScriptElementKind
  /* "label" */ val label: typings.typescript.mod.ScriptElementKind.label & java.lang.String = js.native
  
  @js.native
  sealed trait letElement
    extends StObject
       with ScriptElementKind
  /* "let" */ val letElement: typings.typescript.mod.ScriptElementKind.letElement & java.lang.String = js.native
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends StObject
       with ScriptElementKind
  /* "local class" */ val localClassElement: typings.typescript.mod.ScriptElementKind.localClassElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends StObject
       with ScriptElementKind
  /* "local function" */ val localFunctionElement: typings.typescript.mod.ScriptElementKind.localFunctionElement & java.lang.String = js.native
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends StObject
       with ScriptElementKind
  /* "local var" */ val localVariableElement: typings.typescript.mod.ScriptElementKind.localVariableElement & java.lang.String = js.native
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends StObject
       with ScriptElementKind
  /* "method" */ val memberFunctionElement: typings.typescript.mod.ScriptElementKind.memberFunctionElement & java.lang.String = js.native
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "getter" */ val memberGetAccessorElement: typings.typescript.mod.ScriptElementKind.memberGetAccessorElement & java.lang.String = js.native
  
  @js.native
  sealed trait memberSetAccessorElement
    extends StObject
       with ScriptElementKind
  /* "setter" */ val memberSetAccessorElement: typings.typescript.mod.ScriptElementKind.memberSetAccessorElement & java.lang.String = js.native
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement
    extends StObject
       with ScriptElementKind
  /* "property" */ val memberVariableElement: typings.typescript.mod.ScriptElementKind.memberVariableElement & java.lang.String = js.native
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends StObject
       with ScriptElementKind
  /* "module" */ val moduleElement: typings.typescript.mod.ScriptElementKind.moduleElement & java.lang.String = js.native
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends StObject
       with ScriptElementKind
  /* "parameter" */ val parameterElement: typings.typescript.mod.ScriptElementKind.parameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait primitiveType
    extends StObject
       with ScriptElementKind
  /* "primitive type" */ val primitiveType: typings.typescript.mod.ScriptElementKind.primitiveType & java.lang.String = js.native
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends StObject
       with ScriptElementKind
  /* "script" */ val scriptElement: typings.typescript.mod.ScriptElementKind.scriptElement & java.lang.String = js.native
  
  /** String literal */
  @js.native
  sealed trait string
    extends StObject
       with ScriptElementKind
  /* "string" */ val string: typings.typescript.mod.ScriptElementKind.string & java.lang.String = js.native
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends StObject
       with ScriptElementKind
  /* "type" */ val typeElement: typings.typescript.mod.ScriptElementKind.typeElement & java.lang.String = js.native
  
  @js.native
  sealed trait typeParameterElement
    extends StObject
       with ScriptElementKind
  /* "type parameter" */ val typeParameterElement: typings.typescript.mod.ScriptElementKind.typeParameterElement & java.lang.String = js.native
  
  @js.native
  sealed trait unknown
    extends StObject
       with ScriptElementKind
  /* "" */ val unknown: typings.typescript.mod.ScriptElementKind.unknown & java.lang.String = js.native
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement
    extends StObject
       with ScriptElementKind
  /* "var" */ val variableElement: typings.typescript.mod.ScriptElementKind.variableElement & java.lang.String = js.native
  
  @js.native
  sealed trait warning
    extends StObject
       with ScriptElementKind
  /* "warning" */ val warning: typings.typescript.mod.ScriptElementKind.warning & java.lang.String = js.native
}
