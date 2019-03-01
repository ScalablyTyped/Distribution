package typings
package vinylDashFsLib.vinylDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SrcOptions
  extends globDashStreamLib.globDashStreamMod.GlobStreamNs.Options {
  /**
    * Setting this to false will make file.contents a paused stream
    * If true it will buffer the file contents
    * Default: true
    */
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The mode the directory should be created with.
    * Default: the process mode
    */
  var dirMode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether or not to recursively resolve symlinks to their targets.
    * Setting to `false` to preserve them as symlinks and make `file.symlink`
    * equal the original symlink's target path.
    * Default: true
    */
  var followSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting this to true will create a duplex stream, one that passes
    * through items and emits globbed files.
    * Default: false
    */
  var passthrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting this to false will ignore the contents of the file and disable
    * writing to disk to speed up operations
    * Default: true
    */
  var read: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the symlink should be relative or absolute.
    * Default: false
    */
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Causes the BOM to be removed on UTF-8 encoded files. Set to false if you need the BOM for some reason.
    * Default: true
    */
  var removeBOM: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to recursively resolve symlinks to their targets. Setting to false to
    * preserve them as symlinks and make file.symlink equal the original symlink's target path.
    * Default: false
    */
  var resolveSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  /** Only find files that have been modified since the time specified */
  var since: js.UndefOr[stdLib.Date | scala.Double] = js.undefined
  /**
    * Setting this to true will enable sourcemaps.
    * Default: false
    */
  var sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Causes the BOM to be stripped on UTF-8 encoded files. Set to `false`
    * if you need the BOM for some reason.
    */
  var stripBOM: js.UndefOr[scala.Boolean] = js.undefined
}

object SrcOptions {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    base: java.lang.String = null,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    cache: org.scalablytyped.runtime.StringDictionary[
      scala.Boolean | globLib.globLibStrings.DIR | globLib.globLibStrings.FILE | js.Array[java.lang.String]
    ] = null,
    cwd: java.lang.String = null,
    cwdbase: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    dirMode: scala.Int | scala.Double = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    flipNegate: js.UndefOr[scala.Boolean] = js.undefined,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    followSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    mark: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase: js.UndefOr[scala.Boolean] = js.undefined,
    matchBase_IOptions: js.Any = null,
    nobrace: js.UndefOr[scala.Boolean] = js.undefined,
    nocase: js.UndefOr[scala.Boolean] = js.undefined,
    nocomment: js.UndefOr[scala.Boolean] = js.undefined,
    nodir: js.UndefOr[scala.Boolean] = js.undefined,
    noext: js.UndefOr[scala.Boolean] = js.undefined,
    noglobstar: js.UndefOr[scala.Boolean] = js.undefined,
    nomount: js.UndefOr[scala.Boolean] = js.undefined,
    nonegate: js.UndefOr[scala.Boolean] = js.undefined,
    nonull: js.UndefOr[scala.Boolean] = js.undefined,
    nosort: js.UndefOr[scala.Boolean] = js.undefined,
    nounique: js.UndefOr[scala.Boolean] = js.undefined,
    passthrough: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.UndefOr[scala.Boolean] = js.undefined,
    realpath: js.UndefOr[scala.Boolean] = js.undefined,
    realpathCache: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    relative: js.UndefOr[scala.Boolean] = js.undefined,
    removeBOM: js.UndefOr[scala.Boolean] = js.undefined,
    resolveSymlinks: js.UndefOr[scala.Boolean] = js.undefined,
    root: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    since: stdLib.Date | scala.Double = null,
    sourcemaps: js.UndefOr[scala.Boolean] = js.undefined,
    stat: js.UndefOr[scala.Boolean] = js.undefined,
    statCache: org.scalablytyped.runtime.StringDictionary[js.UndefOr[globLib.globLibNumbers.`false` | globLib.Anon_IsDirectory]] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    stripBOM: js.UndefOr[scala.Boolean] = js.undefined,
    symlinks: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]] = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    uniqueBy: globDashStreamLib.globDashStreamMod.GlobStreamNs.UniqueByStringPredicate | globDashStreamLib.globDashStreamMod.GlobStreamNs.UniqueByFunctionPredicate = null
  ): SrcOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(cwdbase)) __obj.updateDynamic("cwdbase")(cwdbase)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (dirMode != null) __obj.updateDynamic("dirMode")(dirMode.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (!js.isUndefined(flipNegate)) __obj.updateDynamic("flipNegate")(flipNegate)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(mark)) __obj.updateDynamic("mark")(mark)
    if (!js.isUndefined(matchBase)) __obj.updateDynamic("matchBase")(matchBase)
    if (matchBase_IOptions != null) __obj.updateDynamic("matchBase")(matchBase_IOptions)
    if (!js.isUndefined(nobrace)) __obj.updateDynamic("nobrace")(nobrace)
    if (!js.isUndefined(nocase)) __obj.updateDynamic("nocase")(nocase)
    if (!js.isUndefined(nocomment)) __obj.updateDynamic("nocomment")(nocomment)
    if (!js.isUndefined(nodir)) __obj.updateDynamic("nodir")(nodir)
    if (!js.isUndefined(noext)) __obj.updateDynamic("noext")(noext)
    if (!js.isUndefined(noglobstar)) __obj.updateDynamic("noglobstar")(noglobstar)
    if (!js.isUndefined(nomount)) __obj.updateDynamic("nomount")(nomount)
    if (!js.isUndefined(nonegate)) __obj.updateDynamic("nonegate")(nonegate)
    if (!js.isUndefined(nonull)) __obj.updateDynamic("nonull")(nonull)
    if (!js.isUndefined(nosort)) __obj.updateDynamic("nosort")(nosort)
    if (!js.isUndefined(nounique)) __obj.updateDynamic("nounique")(nounique)
    if (!js.isUndefined(passthrough)) __obj.updateDynamic("passthrough")(passthrough)
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(realpath)) __obj.updateDynamic("realpath")(realpath)
    if (realpathCache != null) __obj.updateDynamic("realpathCache")(realpathCache)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    if (!js.isUndefined(removeBOM)) __obj.updateDynamic("removeBOM")(removeBOM)
    if (!js.isUndefined(resolveSymlinks)) __obj.updateDynamic("resolveSymlinks")(resolveSymlinks)
    if (root != null) __obj.updateDynamic("root")(root)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    if (!js.isUndefined(stat)) __obj.updateDynamic("stat")(stat)
    if (statCache != null) __obj.updateDynamic("statCache")(statCache)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(stripBOM)) __obj.updateDynamic("stripBOM")(stripBOM)
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (uniqueBy != null) __obj.updateDynamic("uniqueBy")(uniqueBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SrcOptions]
  }
}

