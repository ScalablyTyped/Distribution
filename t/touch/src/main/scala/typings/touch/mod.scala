package typings.touch

import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](filename: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def apply[T](filename: String, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](filename: String, options: Unit, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](filename: String, options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](filename: String, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ftouch[T](fd: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def ftouch[T](fd: Double, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def ftouch[T](fd: Double, options: Unit, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def ftouch[T](fd: Double, options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def ftouch[T](fd: Double, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def ftouchSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftouchSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ftouchSync(fd: Double, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouchSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sync(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sync(filename: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var atime: js.UndefOr[Boolean | js.Date] = js.undefined
    
    var closeAfter: js.UndefOr[Boolean] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var mtime: js.UndefOr[Boolean | js.Date] = js.undefined
    
    var nocreate: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[String] = js.undefined
    
    var time: js.UndefOr[js.Date | String | Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAtime(value: Boolean | js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      inline def setCloseAfter(value: Boolean): Self = StObject.set(x, "closeAfter", value.asInstanceOf[js.Any])
      
      inline def setCloseAfterUndefined: Self = StObject.set(x, "closeAfter", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setMtime(value: Boolean | js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setNocreate(value: Boolean): Self = StObject.set(x, "nocreate", value.asInstanceOf[js.Any])
      
      inline def setNocreateUndefined: Self = StObject.set(x, "nocreate", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setTime(value: js.Date | String | Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
