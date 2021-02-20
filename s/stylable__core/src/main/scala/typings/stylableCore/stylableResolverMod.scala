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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableResolverMod {
  
  @JSImport("@stylable/core/cjs/stylable-resolver", "StylableResolver")
  @js.native
  class StylableResolver protected () extends StObject {
    def this(
      fileProcessor: FileProcessor[StylableMeta],
      requireModule: js.Function1[/* modulePath */ String, _]
    ) = this()
    
    def deepResolve(): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def deepResolve(maybeImport: js.UndefOr[scala.Nothing], path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def deepResolve(maybeImport: StylableSymbol): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def deepResolve(maybeImport: StylableSymbol, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    var fileProcessor: FileProcessor[StylableMeta] = js.native
    
    /* protected */ def requireModule(modulePath: String): js.Any = js.native
    
    def resolve(): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    def resolve(maybeImport: StylableSymbol): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    def resolveClass(meta: StylableMeta, symbol: StylableSymbol): (CSSResolve[ClassSymbol | ElementSymbol]) | Null = js.native
    
    def resolveElement(meta: StylableMeta, symbol: StylableSymbol): (CSSResolve[ClassSymbol | ElementSymbol]) | Null = js.native
    
    def resolveExtends(meta: StylableMeta, className: String): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: js.UndefOr[scala.Nothing],
      transformer: js.UndefOr[scala.Nothing],
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
      isElement: js.UndefOr[scala.Nothing],
      transformer: StylableTransformer
    ): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: js.UndefOr[scala.Nothing],
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
    def resolveExtends(meta: StylableMeta, className: String, isElement: Boolean): js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
    def resolveExtends(
      meta: StylableMeta,
      className: String,
      isElement: Boolean,
      transformer: js.UndefOr[scala.Nothing],
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
    
    def resolveImport(importSymbol: ImportSymbol): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    def resolveImported(imported: Imported, name: String): CSSResolve[StylableSymbol] | JSResolve | Null = js.native
    
    def resolveKeyframes(meta: StylableMeta, name: String): js.UndefOr[Meta] = js.native
    
    def resolveName(meta: StylableMeta, symbol: StylableSymbol, isElement: Boolean): (CSSResolve[ClassSymbol | ElementSymbol]) | Null = js.native
    
    def resolvePath(path: String): String = js.native
    def resolvePath(path: String, context: String): String = js.native
    
    def resolveSymbolOrigin(symbol: js.UndefOr[scala.Nothing], meta: StylableMeta): CSSResolve[StylableSymbol] | Null = js.native
    def resolveSymbolOrigin(symbol: js.UndefOr[scala.Nothing], meta: StylableMeta, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | Null = js.native
    def resolveSymbolOrigin(symbol: StylableSymbol, meta: StylableMeta): CSSResolve[StylableSymbol] | Null = js.native
    def resolveSymbolOrigin(symbol: StylableSymbol, meta: StylableMeta, path: js.Array[StylableSymbol]): CSSResolve[StylableSymbol] | Null = js.native
    
    def validateImports(meta: StylableMeta, diagnostics: Diagnostics): Unit = js.native
  }
  
  @JSImport("@stylable/core/cjs/stylable-resolver", "isInPath")
  @js.native
  def isInPath(
    extendPath: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
    hasSymbolMeta: CSSResolve[ClassSymbol | ElementSymbol]
  ): js.UndefOr[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
  
  object resolverWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-resolver", "resolverWarnings.UNKNOWN_IMPORTED_FILE")
    @js.native
    def UNKNOWN_IMPORTED_FILE(path: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-resolver", "resolverWarnings.UNKNOWN_IMPORTED_SYMBOL")
    @js.native
    def UNKNOWN_IMPORTED_SYMBOL(name: String, path: String): String = js.native
  }
  
  @js.native
  trait CSSResolve[T /* <: StylableSymbol */] extends StObject {
    
    var _kind: css = js.native
    
    var meta: StylableMeta = js.native
    
    var symbol: T = js.native
  }
  object CSSResolve {
    
    @scala.inline
    def apply[T /* <: StylableSymbol */](_kind: css, meta: StylableMeta, symbol: T): CSSResolve[T] = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSResolve[T]]
    }
    
    @scala.inline
    implicit class CSSResolveMutableBuilder[Self <: CSSResolve[_], T /* <: StylableSymbol */] (val x: Self with CSSResolve[T]) extends AnyVal {
      
      @scala.inline
      def setMeta(value: StylableMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: T): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_kind(value: css): Self = StObject.set(x, "_kind", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSResolve extends StObject {
    
    var _kind: js_ = js.native
    
    var meta: Null = js.native
    
    var symbol: js.Any = js.native
  }
  object JSResolve {
    
    @scala.inline
    def apply(_kind: js_, meta: Null, symbol: js.Any): JSResolve = {
      val __obj = js.Dynamic.literal(_kind = _kind.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
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
