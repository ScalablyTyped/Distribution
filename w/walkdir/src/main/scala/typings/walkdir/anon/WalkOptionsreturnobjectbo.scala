package typings.walkdir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :boolean | undefined} */
@js.native
trait WalkOptionsreturnobjectbo extends js.Object {
  
  /**
    * filter. filter an array of paths from readdir
    */
  var filter: js.UndefOr[
    js.Function2[
      /* directory */ String, 
      /* files */ js.Array[String], 
      js.Array[String] | js.Promise[js.Array[String]]
    ]
  ] = js.native
  
  /*** 
    * default True. if false this will use stat insteqad of lstat and not find links at all.
    */
  var find_links: js.UndefOr[Boolean] = js.native
  
  /**
    * follow symlinks. default FALSE
    */
  var follow_symlinks: js.UndefOr[Boolean] = js.native
  
  /**
    * provide an alternate implementation of fs like graceful-fs
    */
  var fs: js.UndefOr[js.Any] = js.native
  
  /**
    * only travel to max depth. emits an error if hit.
    */
  var max_depth: js.UndefOr[Double] = js.native
  
  /**
    * only go one level deep. convenience param.
    */ 
  var no_recurse: js.UndefOr[Boolean] = js.native
  
   // if true the sync return will be in {path:stat} format instead of [path,path,...]
  /**
    * dont build up an internal list or object of all of the paths. this can be an important optimization for listing HUGE trees.
    */
  var no_return: js.UndefOr[Boolean] = js.native
  
  /**
    * return an object of {path:stat} instead of just the resolved path names
    */
  var return_object: js.UndefOr[Boolean] = js.native
  
  /**
    * make this syncronous. the same as calling walkdir.sync
    */
  var sync: js.UndefOr[Boolean] = js.native
  
  /**
    * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
    * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
    */
  var track_inodes: js.UndefOr[Boolean] = js.native
}
object WalkOptionsreturnobjectbo {
  
  @scala.inline
  def apply(): WalkOptionsreturnobjectbo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptionsreturnobjectbo]
  }
  
  @scala.inline
  implicit class WalkOptionsreturnobjectboOps[Self <: WalkOptionsreturnobjectbo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(
      value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFind_links(value: Boolean): Self = this.set("find_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFind_links: Self = this.set("find_links", js.undefined)
    
    @scala.inline
    def setFollow_symlinks(value: Boolean): Self = this.set("follow_symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_symlinks: Self = this.set("follow_symlinks", js.undefined)
    
    @scala.inline
    def setFs(value: js.Any): Self = this.set("fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFs: Self = this.set("fs", js.undefined)
    
    @scala.inline
    def setMax_depth(value: Double): Self = this.set("max_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_depth: Self = this.set("max_depth", js.undefined)
    
    @scala.inline
    def setNo_recurse(value: Boolean): Self = this.set("no_recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_recurse: Self = this.set("no_recurse", js.undefined)
    
    @scala.inline
    def setNo_return(value: Boolean): Self = this.set("no_return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_return: Self = this.set("no_return", js.undefined)
    
    @scala.inline
    def setReturn_object(value: Boolean): Self = this.set("return_object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn_object: Self = this.set("return_object", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setTrack_inodes(value: Boolean): Self = this.set("track_inodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack_inodes: Self = this.set("track_inodes", js.undefined)
  }
}
