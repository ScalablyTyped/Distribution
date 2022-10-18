package typings.sucrase

import org.scalablytyped.runtime.StringDictionary
import typings.sucrase.distTypesParserTokenizerMod.JSXRole
import typings.sucrase.distTypesUtilGetJSXPragmaInfoMod.JSXPragmaInfo
import typings.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersJsxtransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/JSXTransformer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sucrase/dist/types/transformers/JSXTransformer", JSImport.Default)
  @js.native
  open class default protected () extends JSXTransformer {
    def this(
      rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      importProcessor: Null,
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      options: Options
    ) = this()
    def this(
      rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default,
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      options: Options
    ) = this()
  }
  
  inline def startsWithLowerCase(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWithLowerCase")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait JSXTransformer
    extends typings.sucrase.distTypesTransformersTransformerMod.default {
    
    var cjsAutomaticModuleNameResolutions: StringDictionary[String] = js.native
    
    /**
      * Return code that invokes the given function.
      *
      * When the imports transform is enabled, use the CJSImportTransformer
      * strategy of using `.call(void 0, ...` to avoid passing a `this` value in a
      * situation that would otherwise look like a method call.
      */
    def claimAutoImportedFuncInvocation(funcName: String, importPathSuffix: String): String = js.native
    
    def claimAutoImportedName(funcName: String, importPathSuffix: String): String = js.native
    
    var esmAutomaticImportNameResolutions: StringDictionary[String] = js.native
    
    var filenameVarName: String | Null = js.native
    
    /**
      * Return the code to use for the createElement function, e.g.
      * `React.createElement`, including the following open-paren.
      *
      * This is the main function to use for the classic runtime. For the
      * automatic runtime, this function is used as a fallback function to
      * preserve behavior when there is a prop spread followed by an explicit
      * key. In that automatic runtime case, the function should be automatically
      * imported.
      */
    def getCreateElementInvocationCode(): String = js.native
    
    def getDevSource(elementLocationCode: String): String = js.native
    
    def getElementLocationCode(firstTokenStart: Double): String = js.native
    
    def getFilenameVarName(): String = js.native
    
    /**
      * Return the code to use as the component when compiling a shorthand
      * fragment, e.g. `React.Fragment`.
      *
      * This may be called from either the classic or automatic runtime, and
      * the value should be auto-imported for the automatic runtime.
      */
    def getFragmentCode(): String = js.native
    
    /**
      * Get the code for the relevant function for this context: jsx, jsxs,
      * or jsxDEV. The following open-paren is included as well.
      *
      * These functions are only used for the automatic runtime, so they are always
      * auto-imported, but the auto-import will be either CJS or ESM based on the
      * target module format.
      */
    def getJSXFuncInvocationCode(isStatic: Boolean): String = js.native
    
    /**
      * Get the line number for this source position. This is calculated lazily and
      * must be called in increasing order by index.
      */
    def getLineNumberForIndex(index: Double): Double = js.native
    
    val importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default | Null = js.native
    
    var isAutomaticRuntime: Boolean = js.native
    
    var jsxImportSource: String = js.native
    
    var jsxPragmaInfo: JSXPragmaInfo = js.native
    
    var lastIndex: Double = js.native
    
    var lastLineNumber: Double = js.native
    
    val nameManager: typings.sucrase.distTypesNameManagerMod.default = js.native
    
    val options: Options = js.native
    
    /**
      * Starting in the middle of the props object literal, produce an additional
      * prop for the children and close the object literal.
      */
    def processAutomaticChildrenAndEndProps(jsxRole: JSXRole): Unit = js.native
    
    /**
      * Turn a JSX text element into a string literal, or nothing at all if the JSX
      * text resolves to the empty string.
      *
      * Returns true if a string literal is emitted, false otherwise.
      */
    def processChildTextElement(needsComma: Boolean): Boolean = js.native
    
    /**
      * Transform children into a comma-separated list, which will be either
      * arguments to createElement or array elements of a children prop.
      */
    def processChildren(needsInitialComma: Boolean): Unit = js.native
    
    def processJSXTag(): Unit = js.native
    
    def processPropName(propName: String): Unit = js.native
    
    def processPropValue(): Unit = js.native
    
    /**
      * Transform the core part of the props, assuming that a { has already been
      * inserted before us and that a } will be inserted after us.
      *
      * If extractKeyCode is true (i.e. when using any jsx... function), any prop
      * named "key" has its code captured and returned rather than being emitted to
      * the output code. This shifts line numbers, and emitting the code later will
      * correct line numbers again. If no key is found or if extractKeyCode is
      * false, this function returns null.
      */
    def processProps(extractKeyCode: Boolean): String | Null = js.native
    
    /**
      * Starting at the beginning of the props, add the props argument to
      * React.createElement, including the comma before it.
      */
    def processPropsObjectWithDevInfo(): Unit = js.native
    def processPropsObjectWithDevInfo(elementLocationCode: String): Unit = js.native
    
    def processStringPropValue(): Unit = js.native
    
    /**
      * Process the first part of a tag, before any props.
      */
    def processTagIntro(): Unit = js.native
    
    val rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default = js.native
    
    val tokens: typings.sucrase.distTypesTokenProcessorMod.default = js.native
    
    /**
      * Convert the current JSX element to a createElement call. In the classic
      * runtime, this is the only case. In the automatic runtime, this is called
      * as a fallback in some situations.
      *
      * Example:
      * <div a={1} key={2}>Hello{x}</div>
      * becomes
      * React.createElement('div', {a: 1, key: 2}, "Hello", x)
      */
    def transformTagToCreateElement(): Unit = js.native
    def transformTagToCreateElement(elementLocationCode: String): Unit = js.native
    
    /**
      * Convert the current JSX element to a call to jsx, jsxs, or jsxDEV. This is
      * the primary transformation for the automatic transform.
      *
      * Example:
      * <div a={1} key={2}>Hello{x}</div>
      * becomes
      * jsxs('div', {a: 1, children: ["Hello", x]}, 2)
      */
    def transformTagToJSXFunc(elementLocationCode: String, jsxRole: JSXRole): Unit = js.native
    def transformTagToJSXFunc(elementLocationCode: Null, jsxRole: JSXRole): Unit = js.native
  }
}
