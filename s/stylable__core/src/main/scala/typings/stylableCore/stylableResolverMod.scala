package typings.stylableCore

import typings.stylableCore.anon.Meta
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableCoreStrings.css
import typings.stylableCore.stylableCoreStrings.js_
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.ImportSymbol
import typings.stylableCore.stylableMetaMod.Imported
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableResolverMod {
  
  @JSImport("@stylable/core/cjs/stylable-resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/core/cjs/stylable-resolver", "StylableResolver")
  @js.native
  class StylableResolver protected () extends StObject {
    def this(
      fileProcessor: FileProcessor[StylableMeta],
      requireModule: js.Function1[/* modulePath */ String, js.Any]
    ) = this()
    
    def deepResolve(): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def deepResolve(maybeImport: Unit, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def deepResolve(maybeImport: StylableSymbol): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def deepResolve(maybeImport: StylableSymbol, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    var fileProcessor: FileProcessor[StylableMeta] = js.native
    
    /* protected */ def requireModule(modulePath: String): js.Any = js.native
    
    def resolve(): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def resolve(maybeImport: StylableSymbol): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    def resolveClass(meta: StylableMeta, symbol: StylableSymbol): (CSSResolve[ClassSymbol | ElementSymbol]) | Null = js.native
    
    def resolveElement(meta: StylableMeta, symbol: StylableSymbol): (CSSResolve[ClassSymbol | ElementSymbol]) | Null = js.native
    
    def resolveExtends(meta: StylableMeta, className: String): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(meta: StylableMeta, className: String, isElement: Boolean): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: Boolean,
      transformer: Unit,
      reportError: js.Function6[
          /* res */ CSSResolve[StylableSymbol] | JSResolve | Null, 
          /* extend */ ImportSymbol | ClassSymbol | ElementSymbol, 
          /* extendPath */ js.Array[CSSResolve[ClassSymbol | ElementSymbol]], 
          /* meta */ StylableMeta, 
          /* className */ String, 
          /* isElement */ Boolean, 
          Unit
        ]
    ): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(meta: StylableMeta, className: String, isElement: Boolean, transformer: StylableTransformer): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: Boolean,
      transformer: StylableTransformer,
      reportError: js.Function6[
          /* res */ CSSResolve[StylableSymbol] | JSResolve | Null, 
          /* extend */ ImportSymbol | ClassSymbol | ElementSymbol, 
          /* extendPath */ js.Array[CSSResolve[ClassSymbol | ElementSymbol]], 
          /* meta */ StylableMeta, 
          /* className */ String, 
          /* isElement */ Boolean, 
          Unit
        ]
    ): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: Unit,
      transformer: Unit,
      reportError: js.Function6[
          /* res */ CSSResolve[StylableSymbol] | JSResolve | Null, 
          /* extend */ ImportSymbol | ClassSymbol | ElementSymbol, 
          /* extendPath */ js.Array[CSSResolve[ClassSymbol | ElementSymbol]], 
          /* meta */ StylableMeta, 
          /* className */ String, 
          /* isElement */ Boolean, 
          Unit
        ]
    ): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(meta: StylableMeta, className: String, isElement: Unit, transformer: StylableTransformer): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: Unit,
      transformer: StylableTransformer,
      reportError: js.Function6[
          /* res */ CSSResolve[StylableSymbol] | JSResolve | Null, 
          /* extend */ ImportSymbol | ClassSymbol | ElementSymbol, 
          /* extendPath */ js.Array[CSSResolve[ClassSymbol | ElementSymbol]], 
          /* meta */ StylableMeta, 
          /* className */ String, 
          /* isElement */ Boolean, 
          Unit
        ]
    ): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    
    def resolveImport(importSymbol: ImportSymbol): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    def resolveImported(imported: Imported, name: String): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    def resolveKeyframes(meta: StylableMeta, name: String): js.UndefOr[Meta] = js.native
    
    def resolveName(meta: StylableMeta, symbol: StylableSymbol, isElement: Boolean): (CSSResolve[ClassSymbol | ElementSymbol]) | Null = js.native
    
    def resolvePath(path: String): String = js.native
    def resolvePath(path: String, context: String): String = js.native
    
    def resolveSymbolOrigin(symbol: Unit, meta: StylableMeta): CSSResolve[StylableSymbol] | Null = js.native
    def resolveSymbolOrigin(symbol: Unit, meta: StylableMeta, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | Null = js.native
    def resolveSymbolOrigin(symbol: StylableSymbol, meta: StylableMeta): CSSResolve[StylableSymbol] | Null = js.native
    def resolveSymbolOrigin(symbol: StylableSymbol, meta: StylableMeta, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | Null = js.native
    
    def validateImports(meta: StylableMeta, diagnostics: Diagnostics): Unit = js.native
  }
  
  @scala.inline
  def isInPath(
    extendPath: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
    hasHasName1HasSource1: CSSResolve[ClassSymbol | ElementSymbol]
  ): js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]] = (^.asInstanceOf[js.Dynamic].applyDynamic("isInPath")(extendPath.asInstanceOf[js.Any], hasHasName1HasSource1.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]]]
  
  object resolverWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-resolver", "resolverWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def UNKNOWN_IMPORTED_FILE(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_IMPORTED_FILE")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def UNKNOWN_IMPORTED_SYMBOL(name: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_IMPORTED_SYMBOL")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  trait CSSResolve[T /* <: StylableSymbol */] extends StObject {
    
    var _kind: css
    
    var meta: StylableMeta
    
    var symbol: T
  }
  object CSSResolve {
    
    @scala.inline
    def apply[T /* <: StylableSymbol */](meta: StylableMeta, symbol: T): CSSResolve[T] = {
      val __obj = js.Dynamic.literal(_kind = "css", meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSResolve[T]]
    }
    
    @scala.inline
    implicit class CSSResolveMutableBuilder[Self <: CSSResolve[?], T /* <: StylableSymbol */] (val x: Self & CSSResolve[T]) extends AnyVal {
      
      @scala.inline
      def setMeta(value: StylableMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: T): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: css): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSResolve extends StObject {
    
    var _kind: js_
    
    var meta: Null
    
    var symbol: js.Any
  }
  object JSResolve {
    
    @scala.inline
    def apply(meta: Null, symbol: js.Any): JSResolve = {
      val __obj = js.Dynamic.literal(_kind = "js", meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSResolve]
    }
    
    @scala.inline
    implicit class JSResolveMutableBuilder[Self <: JSResolve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: Null): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: js.Any): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: js_): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
}
