package typings.subleveldown

import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.ErrorCallback
import typings.levelCodec.mod.CodecOptions
import typings.levelup.mod.LevelUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a `levelup` instance that uses subleveldown to prefix the keys of the underlying store of `db`.
    * Any layers that this instance may have (like `encoding-down` or `subleveldown` itself) are peeled off to get to the innermost `abstract-leveldown` compliant store (like `leveldown`).
    * This ensures there is no double encoding step.
    * @param db
    * @param prefix If omitted, the effective prefix is two separators, e.g. `'!!'`. If `db` is already a subleveldown-powered instance, the effective prefix is a combined prefix, e.g. `'!one!!two!'`.
    * @param opts
    * @see {@link https://github.com/Level/subleveldown#api subleveldown API}
    */
  @JSImport("subleveldown", JSImport.Namespace)
  @js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  @JSImport("subleveldown", JSImport.Namespace)
  @js.native
  def apply[K, V](
    db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]],
    prefix: js.UndefOr[scala.Nothing],
    opts: String
  ): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  @JSImport("subleveldown", JSImport.Namespace)
  @js.native
  def apply[K, V](
    db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]],
    prefix: js.UndefOr[scala.Nothing],
    opts: SubDownOptions
  ): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  @JSImport("subleveldown", JSImport.Namespace)
  @js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], prefix: String): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  @JSImport("subleveldown", JSImport.Namespace)
  @js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], prefix: String, opts: String): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  @JSImport("subleveldown", JSImport.Namespace)
  @js.native
  def apply[K, V](db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], prefix: String, opts: SubDownOptions): LevelUp[AbstractLevelDOWN[K, V], AbstractIterator[K, V]] = js.native
  
  /** @see {@link SubDownOptions#open} */
  type SubDownOpenHook = js.Function1[/* callback */ ErrorCallback, Unit]
  
  /**
    * Any other options are passed along to the underlying `levelup` and `encoding-down` constructors.
    * {@link https://github.com/Level/subleveldown#api See their documentation for further details}.
    */
  @js.native
  trait SubDownOptions
    extends CodecOptions
       with // TODO: Remove and inherit from constructor options from levelup package
  /* key */ StringDictionary[js.Any] {
    
    /**
      * Optional open hook called when the underlying `levelup` instance has been opened.
      * The hook receives a callback which must be called to finish opening.
      */
    var open: js.UndefOr[SubDownOpenHook] = js.native
    
    /**
      * Character for separating sublevel prefixes from user keys and each other. Should be outside the character (or byte) range of user keys.
      * @default '!'
      */
    var separator: js.UndefOr[String] = js.native
  }
  object SubDownOptions {
    
    @scala.inline
    def apply(): SubDownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubDownOptions]
    }
    
    @scala.inline
    implicit class SubDownOptionsMutableBuilder[Self <: SubDownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: /* callback */ ErrorCallback => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
