package typings.upath2

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.node.pathMod.PlatformPath
import typings.upath2.anon.PickPathWrapkeyofIPathNod
import typings.upath2.anon.TypeofPathWrap
import typings.upath2.libTypeMod.IPath
import typings.upath2.libTypeMod.IPathPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("upath2/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default extends Shortcut {
    
    @JSImport("upath2/core", JSImport.Default)
    @js.native
    val ^ : IUPath = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("upath2/core", "default.PathWrap")
    @js.native
    open class PathWrapCls protected () extends PathWrap {
      def this(path: Any, id: String) = this()
    }
    
    type _To = IUPath
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: IUPath = ^
  }
  
  @JSImport("upath2/core", "PathWrap")
  @js.native
  open class PathWrap protected ()
    extends StObject
       with IPath {
    def this(path: Any, id: String) = this()
    
    @JSName("default")
    var default_PathWrap: PathWrap = js.native
    
    @JSName("delimiter")
    var delimiter_PathWrap: String = js.native
    
    @JSName("fn")
    var fn_PathWrap: IPath = js.native
    
    @JSName("name")
    var name_PathWrap: String | IPathPlatform = js.native
    
    var node: PlatformPath = js.native
    
    @JSName("posix")
    var posix_PathWrap: IPath = js.native
    
    @JSName("sep")
    var sep_PathWrap: String = js.native
    
    @JSName("upath")
    var upath_PathWrap: PathWrap = js.native
    
    @JSName("win32")
    var win32_PathWrap: IPath = js.native
  }
  object PathWrap {
    
    @JSImport("upath2/core", "PathWrap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("upath2/core", "PathWrap.fn")
    @js.native
    def fn: typings.upath2.libTypeMod.IPath = js.native
    inline def fn_=(x: typings.upath2.libTypeMod.IPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
    
    type IParse = typings.upath2.libTypeMod.IParse
    
    type IPath = typings.upath2.libTypeMod.IPath
    
    type IPathNode = typings.upath2.libTypeMod.IPathNode
  }
  
  @JSImport("upath2/core", "fn")
  @js.native
  val fn: IPath = js.native
  
  @JSImport("upath2/core", "posix")
  @js.native
  val posix: IPath = js.native
  
  inline def thisOrigin(who: IPath): PickPathWrapkeyofIPathNod = ^.asInstanceOf[js.Dynamic].applyDynamic("_this_origin")(who.asInstanceOf[js.Any]).asInstanceOf[PickPathWrapkeyofIPathNod]
  
  object upath extends Shortcut {
    
    @JSImport("upath2/core", "upath")
    @js.native
    val ^ : IUPath = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("upath2/core", "upath.PathWrap")
    @js.native
    open class PathWrapCls protected () extends PathWrap {
      def this(path: Any, id: String) = this()
    }
    
    type _To = IUPath
    
    /* This means you don't have to write `^`, but can instead just say `upath.foo` */
    override def _to: IUPath = ^
  }
  
  @JSImport("upath2/core", "win32")
  @js.native
  val win32: IPath = js.native
  
  @js.native
  trait IUPath extends PathWrap {
    
    var PathWrap: TypeofPathWrap & (Instantiable2[/* path */ Any, /* id */ String, typings.upath2.coreMod.PathWrap]) = js.native
    
    @JSName("default")
    var default_IUPath: IUPath = js.native
    
    @JSName("upath")
    var upath_IUPath: IUPath = js.native
  }
}
