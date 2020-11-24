package typings.stylableCore.stylableResolverMod

import typings.stylableCore.anon.Meta
import typings.stylableCore.cachedProcessFileMod.FileProcessor
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.ImportSymbol
import typings.stylableCore.stylableMetaMod.Imported
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-resolver", "StylableResolver")
@js.native
class StylableResolver protected () extends js.Object {
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
