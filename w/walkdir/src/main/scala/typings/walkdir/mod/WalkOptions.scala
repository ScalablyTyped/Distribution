package typings.walkdir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkOptions extends js.Object {
  /**
    * filter. filter an array of paths from readdir
    */
  var filter: js.UndefOr[
    js.Function2[
      /* directory */ String, 
      /* files */ js.Array[String], 
      js.Array[String] | js.Promise[js.Array[String]]
    ]
  ] = js.undefined
  /*** 
    * default True. if false this will use stat insteqad of lstat and not find links at all.
    */
  var find_links: js.UndefOr[Boolean] = js.undefined
  /**
    * follow symlinks. default FALSE
    */
  var follow_symlinks: js.UndefOr[Boolean] = js.undefined
  /**
    * provide an alternate implementation of fs like graceful-fs
    */
  var fs: js.UndefOr[js.Any] = js.undefined
  /**
    * only travel to max depth. emits an error if hit.
    */
  var max_depth: js.UndefOr[Double] = js.undefined
  /**
    * only go one level deep. convenience param.
    */ 
  var no_recurse: js.UndefOr[Boolean] = js.undefined
   // if true the sync return will be in {path:stat} format instead of [path,path,...]
  /**
    * dont build up an internal list or object of all of the paths. this can be an important optimization for listing HUGE trees.
    */
  var no_return: js.UndefOr[Boolean] = js.undefined
  /**
    * return an object of {path:stat} instead of just the resolved path names
    */
  var return_object: js.UndefOr[Boolean] = js.undefined
  /**
    * make this syncronous. the same as calling walkdir.sync
    */
  var sync: js.UndefOr[Boolean] = js.undefined
  /**
    * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
    * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
    */
  var track_inodes: js.UndefOr[Boolean] = js.undefined
}

object WalkOptions {
  @scala.inline
  def apply(
    filter: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]] = null,
    find_links: js.UndefOr[Boolean] = js.undefined,
    follow_symlinks: js.UndefOr[Boolean] = js.undefined,
    fs: js.Any = null,
    max_depth: js.UndefOr[Double] = js.undefined,
    no_recurse: js.UndefOr[Boolean] = js.undefined,
    no_return: js.UndefOr[Boolean] = js.undefined,
    return_object: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined,
    track_inodes: js.UndefOr[Boolean] = js.undefined
  ): WalkOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(find_links)) __obj.updateDynamic("find_links")(find_links.get.asInstanceOf[js.Any])
    if (!js.isUndefined(follow_symlinks)) __obj.updateDynamic("follow_symlinks")(follow_symlinks.get.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(max_depth)) __obj.updateDynamic("max_depth")(max_depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(no_recurse)) __obj.updateDynamic("no_recurse")(no_recurse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(no_return)) __obj.updateDynamic("no_return")(no_return.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_object)) __obj.updateDynamic("return_object")(return_object.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_inodes)) __obj.updateDynamic("track_inodes")(track_inodes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptions]
  }
}

