package typings.webidl2js

import typings.webidl2.mod.AttributeMemberType
import typings.webidl2js.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webidl2js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Transformer {
    def this(opts: Options) = this()
    
    /**
      * @param idl The WebIDL file or directory of WebIDL files
      *        to generate wrappers for.
      * @param impl The directory containing implementation files
      *        for the provided WebIDL file(s).
      */
    /* CompleteClass */
    override def addSource(idl: String, impl: String): this.type = js.native
    
    /**
      * Generates WebIDL2JS wrapper classes for the supplied WebIDL file(s)
      * in the supplied output directory.
      *
      * @param outputDir The directory where WebIDL2JS wrappers will be generated in.
      * @return A promise that will be resolved once all files have been written,
      *         or rejected if an error was encountered.
      */
    /* CompleteClass */
    override def generate(outputDir: String): js.Promise[Unit] = js.native
  }
  
  type AttributeProcessor = js.ThisFunction2[/* this */ ProcessorContext, /* idl */ AttributeMemberType, /* implName */ String, Get]
  
  type CodeProcessor = js.ThisFunction1[/* this */ ProcessorContext, /* code */ String, String]
  
  trait Options extends StObject {
    
    /**
      * The optional suffix present on implementation files.
      *
      * @default ""
      */
    var implSuffix: js.UndefOr[String] = js.undefined
    
    /**
      * The function used to modify attributes and operations
      * with the `[CEReactions]` extended attribute.
      *
      * The default value is the identity function.
      */
    var processCEReactions: js.UndefOr[CodeProcessor] = js.undefined
    
    /**
      * The function used to modify attributes and operations
      * with the `[HTMLConstructor]` extended attribute.
      *
      * The default value is the identity function.
      */
    var processHTMLConstructor: js.UndefOr[CodeProcessor] = js.undefined
    
    /**
      * The function used to generate attributes and operations
      * with the `[Reflect]` extended attribute.
      *
      * @default null
      */
    var processReflect: js.UndefOr[AttributeProcessor | Null] = js.undefined
    
    /**
      * Whether non-fatal errors should be ignored.
      *
      * @default false
      */
    var suppressErrors: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setImplSuffix(value: String): Self = StObject.set(x, "implSuffix", value.asInstanceOf[js.Any])
      
      inline def setImplSuffixUndefined: Self = StObject.set(x, "implSuffix", js.undefined)
      
      inline def setProcessCEReactions(value: CodeProcessor): Self = StObject.set(x, "processCEReactions", value.asInstanceOf[js.Any])
      
      inline def setProcessCEReactionsUndefined: Self = StObject.set(x, "processCEReactions", js.undefined)
      
      inline def setProcessHTMLConstructor(value: CodeProcessor): Self = StObject.set(x, "processHTMLConstructor", value.asInstanceOf[js.Any])
      
      inline def setProcessHTMLConstructorUndefined: Self = StObject.set(x, "processHTMLConstructor", js.undefined)
      
      inline def setProcessReflect(value: AttributeProcessor): Self = StObject.set(x, "processReflect", value.asInstanceOf[js.Any])
      
      inline def setProcessReflectNull: Self = StObject.set(x, "processReflect", null)
      
      inline def setProcessReflectUndefined: Self = StObject.set(x, "processReflect", js.undefined)
      
      inline def setSuppressErrors(value: Boolean): Self = StObject.set(x, "suppressErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressErrorsUndefined: Self = StObject.set(x, "suppressErrors", js.undefined)
    }
  }
  
  @js.native
  trait ProcessorContext extends StObject {
    
    /**
      * @param specifier The import specifier.
      * @param property The imported property, when undefined or empty,
      *        then the whole module namespace will be imported.
      * @return The identifier referring to this imported value.
      */
    def addImport(specifier: String): String = js.native
    def addImport(specifier: String, property: String): String = js.native
  }
  
  trait Transformer extends StObject {
    
    /**
      * @param idl The WebIDL file or directory of WebIDL files
      *        to generate wrappers for.
      * @param impl The directory containing implementation files
      *        for the provided WebIDL file(s).
      */
    def addSource(idl: String, impl: String): this.type
    
    /**
      * Generates WebIDL2JS wrapper classes for the supplied WebIDL file(s)
      * in the supplied output directory.
      *
      * @param outputDir The directory where WebIDL2JS wrappers will be generated in.
      * @return A promise that will be resolved once all files have been written,
      *         or rejected if an error was encountered.
      */
    def generate(outputDir: String): js.Promise[Unit]
  }
  object Transformer {
    
    inline def apply(addSource: (String, String) => Transformer, generate: String => js.Promise[Unit]): Transformer = {
      val __obj = js.Dynamic.literal(addSource = js.Any.fromFunction2(addSource), generate = js.Any.fromFunction1(generate))
      __obj.asInstanceOf[Transformer]
    }
    
    extension [Self <: Transformer](x: Self) {
      
      inline def setAddSource(value: (String, String) => Transformer): Self = StObject.set(x, "addSource", js.Any.fromFunction2(value))
      
      inline def setGenerate(value: String => js.Promise[Unit]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    }
  }
}
