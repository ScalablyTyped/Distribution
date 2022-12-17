package typings.walkdir

import typings.walkdir.walkdirBooleans.`false`
import typings.walkdir.walkdirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :boolean | undefined} */
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
    var fs: js.UndefOr[Any] = js.undefined
    
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
  object WalkOptionsreturnobjectbo {
    
    inline def apply(): WalkOptionsreturnobjectbo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptionsreturnobjectbo]
    }
    
    extension [Self <: WalkOptionsreturnobjectbo](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :false | undefined} */
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
    var fs: js.UndefOr[Any] = js.undefined
    
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
  object WalkOptionsreturnobjectfa {
    
    inline def apply(): WalkOptionsreturnobjectfa = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptionsreturnobjectfa]
    }
    
    extension [Self <: WalkOptionsreturnobjectfa](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined walkdir.walkdir/walkdir.WalkOptions & {  return_object :true} */
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
    var fs: js.UndefOr[Any] = js.undefined
    
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
  object WalkOptionsreturnobjecttr {
    
    inline def apply(): WalkOptionsreturnobjecttr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptionsreturnobjecttr]
    }
    
    extension [Self <: WalkOptionsreturnobjecttr](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined {  sync :false | undefined} & walkdir.walkdir/walkdir.WalkOptions */
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
    var fs: js.UndefOr[Any] = js.undefined
    
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
    var sync: js.UndefOr[`false`] = js.undefined
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.undefined
  }
  object syncfalseundefinedWalkOpt {
    
    inline def apply(): syncfalseundefinedWalkOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[syncfalseundefinedWalkOpt]
    }
    
    extension [Self <: syncfalseundefinedWalkOpt](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: Boolean): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      inline def setSync(value: `false`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined {  sync :true,   return_object :false | undefined} & walkdir.walkdir/walkdir.WalkOptions */
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
    var fs: js.UndefOr[Any] = js.undefined
    
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
    var return_object: js.UndefOr[`false`] = js.undefined
    
    /**
      * make this syncronous. the same as calling walkdir.sync
      */
    var sync: `true`
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.undefined
  }
  object synctruereturnobjectfalse {
    
    inline def apply(): synctruereturnobjectfalse = {
      val __obj = js.Dynamic.literal(sync = true)
      __obj.asInstanceOf[synctruereturnobjectfalse]
    }
    
    extension [Self <: synctruereturnobjectfalse](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: `false`): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setReturn_objectUndefined: Self = StObject.set(x, "return_object", js.undefined)
      
      inline def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
  
  /* Inlined {  sync :true,   return_object :true} & walkdir.walkdir/walkdir.WalkOptions */
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
    var fs: js.UndefOr[Any] = js.undefined
    
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
    var return_object: `true`
    
    /**
      * make this syncronous. the same as calling walkdir.sync
      */
    var sync: `true`
    
    /**
      * on filesystems where inodes are not unique like windows (or perhaps hardlinks) some files may not be emitted due to inode collision.
      * turning off this behavior may be required but at the same time may lead to hitting max_depth via link loop.
      */
    var track_inodes: js.UndefOr[Boolean] = js.undefined
  }
  object synctruereturnobjecttrueW {
    
    inline def apply(): synctruereturnobjecttrueW = {
      val __obj = js.Dynamic.literal(return_object = true, sync = true)
      __obj.asInstanceOf[synctruereturnobjecttrueW]
    }
    
    extension [Self <: synctruereturnobjecttrueW](x: Self) {
      
      inline def setFilter(
        value: (/* directory */ String, /* files */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind_links(value: Boolean): Self = StObject.set(x, "find_links", value.asInstanceOf[js.Any])
      
      inline def setFind_linksUndefined: Self = StObject.set(x, "find_links", js.undefined)
      
      inline def setFollow_symlinks(value: Boolean): Self = StObject.set(x, "follow_symlinks", value.asInstanceOf[js.Any])
      
      inline def setFollow_symlinksUndefined: Self = StObject.set(x, "follow_symlinks", js.undefined)
      
      inline def setFs(value: Any): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_recurse(value: Boolean): Self = StObject.set(x, "no_recurse", value.asInstanceOf[js.Any])
      
      inline def setNo_recurseUndefined: Self = StObject.set(x, "no_recurse", js.undefined)
      
      inline def setNo_return(value: Boolean): Self = StObject.set(x, "no_return", value.asInstanceOf[js.Any])
      
      inline def setNo_returnUndefined: Self = StObject.set(x, "no_return", js.undefined)
      
      inline def setReturn_object(value: `true`): Self = StObject.set(x, "return_object", value.asInstanceOf[js.Any])
      
      inline def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodes(value: Boolean): Self = StObject.set(x, "track_inodes", value.asInstanceOf[js.Any])
      
      inline def setTrack_inodesUndefined: Self = StObject.set(x, "track_inodes", js.undefined)
    }
  }
}
