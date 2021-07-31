package typings.touch

import typings.node.NodeJS.ErrnoException
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](filename: String): js.Promise[T] = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def apply[T](filename: String, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def apply[T](filename: String, options: Unit, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def apply[T](filename: String, options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def apply[T](filename: String, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ftouch[T](fd: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def ftouch[T](fd: Double, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def ftouch[T](fd: Double, options: Unit, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def ftouch[T](fd: Double, options: Options): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def ftouch[T](fd: Double, options: Options, cb: js.Function1[/* err */ js.UndefOr[ErrnoException], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouch")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def ftouchSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftouchSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def ftouchSync(fd: Double, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftouchSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sync(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def sync(filename: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var atime: js.UndefOr[Boolean | Date] = js.undefined
    
    var closeAfter: js.UndefOr[Boolean] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var mtime: js.UndefOr[Boolean | Date] = js.undefined
    
    var nocreate: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[String] = js.undefined
    
    var time: js.UndefOr[Date | String | Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: Boolean | Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
      
      @scala.inline
      def setCloseAfter(value: Boolean): Self = StObject.set(x, "closeAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseAfterUndefined: Self = StObject.set(x, "closeAfter", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMtime(value: Boolean | Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      @scala.inline
      def setNocreate(value: Boolean): Self = StObject.set(x, "nocreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocreateUndefined: Self = StObject.set(x, "nocreate", js.undefined)
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setTime(value: Date | String | Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
