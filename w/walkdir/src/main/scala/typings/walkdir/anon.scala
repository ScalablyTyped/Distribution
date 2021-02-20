package typings.walkdir

import typings.walkdir.walkdirBooleans.`false`
import typings.walkdir.walkdirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :boolean | undefined} */
  @js.native
  trait WalkOptionsreturnobjectbo extends StObject {
    
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
    implicit class WalkOptionsreturnobjectboMutableBuilder[Self <: WalkOptionsreturnobjectbo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      @scala.inline
      def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      @scala.inline
      def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      @scala.inline
      def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :false | undefined} */
  @js.native
  trait WalkOptionsreturnobjectfa extends StObject {
    
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
    var return_object: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
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
  object WalkOptionsreturnobjectfa {
    
    @scala.inline
    def apply(return_object: js.UndefOr[Boolean] with js.UndefOr[`false`]): WalkOptionsreturnobjectfa = {
      val __obj = js.Dynamic.literal(return_object = return_object.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkOptionsreturnobjectfa]
    }
    
    @scala.inline
    implicit class WalkOptionsreturnobjectfaMutableBuilder[Self <: WalkOptionsreturnobjectfa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      @scala.inline
      def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      @scala.inline
      def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      @scala.inline
      def setReturn_object(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :true} */
  @js.native
  trait WalkOptionsreturnobjecttr extends StObject {
    
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
    var return_object: js.UndefOr[Boolean] with `true` = js.native
    
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
  object WalkOptionsreturnobjecttr {
    
    @scala.inline
    def apply(return_object: js.UndefOr[Boolean] with `true`): WalkOptionsreturnobjecttr = {
      val __obj = js.Dynamic.literal(return_object = return_object.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkOptionsreturnobjecttr]
    }
    
    @scala.inline
    implicit class WalkOptionsreturnobjecttrMutableBuilder[Self <: WalkOptionsreturnobjecttr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      @scala.inline
      def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      @scala.inline
      def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      @scala.inline
      def setReturn_object(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined {  sync :false | undefined} & walkdir.walkdir/walkdir.WalkOptions */
  @js.native
  trait syncfalseundefinedWalkOpt extends StObject {
    
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
    var sync: js.UndefOr[`false`] with js.UndefOr[Boolean] = js.native
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.native
  }
  object syncfalseundefinedWalkOpt {
    
    @scala.inline
    def apply(sync: js.UndefOr[`false`] with js.UndefOr[Boolean]): syncfalseundefinedWalkOpt = {
      val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[syncfalseundefinedWalkOpt]
    }
    
    @scala.inline
    implicit class syncfalseundefinedWalkOptMutableBuilder[Self <: syncfalseundefinedWalkOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      @scala.inline
      def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      @scala.inline
      def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      @scala.inline
      def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      @scala.inline
      def setSync(value: js.UndefOr[`false`] with js.UndefOr[Boolean]): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined {  sync :true,   return_object :false | undefined} & walkdir.walkdir/walkdir.WalkOptions */
  @js.native
  trait synctruereturnobjectfalse extends StObject {
    
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
    var return_object: js.UndefOr[`false`] with js.UndefOr[Boolean] = js.native
    
    /**
      * make this syncronous. the same as calling walkdir.sync
      */
    var sync: `true` with js.UndefOr[Boolean] = js.native
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.native
  }
  object synctruereturnobjectfalse {
    
    @scala.inline
    def apply(return_object: js.UndefOr[`false`] with js.UndefOr[Boolean], sync: `true` with js.UndefOr[Boolean]): synctruereturnobjectfalse = {
      val __obj = js.Dynamic.literal(return_object = return_object.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[synctruereturnobjectfalse]
    }
    
    @scala.inline
    implicit class synctruereturnobjectfalseMutableBuilder[Self <: synctruereturnobjectfalse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      @scala.inline
      def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      @scala.inline
      def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      @scala.inline
      def setReturn_object(value: js.UndefOr[`false`] with js.UndefOr[Boolean]): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined {  sync :true,   return_object :true} & walkdir.walkdir/walkdir.WalkOptions */
  @js.native
  trait synctruereturnobjecttrueW extends StObject {
    
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
    var return_object: `true` with js.UndefOr[Boolean] = js.native
    
    /**
      * make this syncronous. the same as calling walkdir.sync
      */
    var sync: `true` with js.UndefOr[Boolean] = js.native
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.native
  }
  object synctruereturnobjecttrueW {
    
    @scala.inline
    def apply(return_object: `true` with js.UndefOr[Boolean], sync: `true` with js.UndefOr[Boolean]): synctruereturnobjecttrueW = {
      val __obj = js.Dynamic.literal(return_object = return_object.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[synctruereturnobjecttrueW]
    }
    
    @scala.inline
    implicit class synctruereturnobjecttrueWMutableBuilder[Self <: synctruereturnobjecttrueW] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      @scala.inline
      def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      @scala.inline
      def setFs(value: js.Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      @scala.inline
      def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      @scala.inline
      def setReturn_object(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: `true` with js.UndefOr[Boolean]): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
}
