package typings.wkhtmltopdf

import typings.node.NodeJS.ReadWriteStream
import typings.node.bufferMod.global.Buffer
import typings.node.processMod.global.NodeJS.ReadStream
import typings.wkhtmltopdf.wkhtmltopdfStrings.A0
import typings.wkhtmltopdf.wkhtmltopdfStrings.A1
import typings.wkhtmltopdf.wkhtmltopdfStrings.A2
import typings.wkhtmltopdf.wkhtmltopdfStrings.A3
import typings.wkhtmltopdf.wkhtmltopdfStrings.A4
import typings.wkhtmltopdf.wkhtmltopdfStrings.A5
import typings.wkhtmltopdf.wkhtmltopdfStrings.A6
import typings.wkhtmltopdf.wkhtmltopdfStrings.A7
import typings.wkhtmltopdf.wkhtmltopdfStrings.A8
import typings.wkhtmltopdf.wkhtmltopdfStrings.A9
import typings.wkhtmltopdf.wkhtmltopdfStrings.B0
import typings.wkhtmltopdf.wkhtmltopdfStrings.B1
import typings.wkhtmltopdf.wkhtmltopdfStrings.B10
import typings.wkhtmltopdf.wkhtmltopdfStrings.B2
import typings.wkhtmltopdf.wkhtmltopdfStrings.B3
import typings.wkhtmltopdf.wkhtmltopdfStrings.B4
import typings.wkhtmltopdf.wkhtmltopdfStrings.B5
import typings.wkhtmltopdf.wkhtmltopdfStrings.B6
import typings.wkhtmltopdf.wkhtmltopdfStrings.B7
import typings.wkhtmltopdf.wkhtmltopdfStrings.B8
import typings.wkhtmltopdf.wkhtmltopdfStrings.B9
import typings.wkhtmltopdf.wkhtmltopdfStrings.C5E
import typings.wkhtmltopdf.wkhtmltopdfStrings.Comm10E
import typings.wkhtmltopdf.wkhtmltopdfStrings.DLE
import typings.wkhtmltopdf.wkhtmltopdfStrings.Executive
import typings.wkhtmltopdf.wkhtmltopdfStrings.Folio
import typings.wkhtmltopdf.wkhtmltopdfStrings.Landscape
import typings.wkhtmltopdf.wkhtmltopdfStrings.Ledger
import typings.wkhtmltopdf.wkhtmltopdfStrings.Legal
import typings.wkhtmltopdf.wkhtmltopdfStrings.Letter
import typings.wkhtmltopdf.wkhtmltopdfStrings.Portrait
import typings.wkhtmltopdf.wkhtmltopdfStrings.Tabloid
import typings.wkhtmltopdf.wkhtmltopdfStrings.abort
import typings.wkhtmltopdf.wkhtmltopdfStrings.error
import typings.wkhtmltopdf.wkhtmltopdfStrings.ignore
import typings.wkhtmltopdf.wkhtmltopdfStrings.info
import typings.wkhtmltopdf.wkhtmltopdfStrings.none
import typings.wkhtmltopdf.wkhtmltopdfStrings.skip
import typings.wkhtmltopdf.wkhtmltopdfStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Call wkhtmltopdf and write PDF
    * If options.output is defined the file will be returned in the stream
    *
    * @param html HTML to convert to PDF
    * @param [options] Options
    */
  inline def apply(html: String): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(
    html: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error, /* stream */ ReadWriteStream, Unit]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(html: String, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  inline def apply(
    html: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* stream */ ReadWriteStream, Unit]
  ): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  /**
    * Call wkhtmltopdf and write PDF
    * If options.output is defined the file will be returned in the stream
    *
    * @param inputStream Input stream of html
    * @param [options] Options
    * @param [callback] Callback
    */
  inline def apply(inputStream: ReadStream): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(inputStream.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  inline def apply(inputStream: ReadStream, options: Options): ReadWriteStream = (^.asInstanceOf[js.Dynamic].apply(inputStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadWriteStream]
  
  @JSImport("wkhtmltopdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set the path to the wkhtmltopdf executable
    * Default: wkhtmltopdf
    */
  @JSImport("wkhtmltopdf", "command")
  @js.native
  def command: String = js.native
  inline def command_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("command")(x.asInstanceOf[js.Any])
  
  /**
    * Set the path to the shell where wkhtmltopdf gets executed in
    * Default: /bin/bash
    */
  @JSImport("wkhtmltopdf", "shell")
  @js.native
  def shell: String = js.native
  inline def shell_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shell")(x.asInstanceOf[js.Any])
  
  trait Options extends StObject {
    
    /****************
      * Page options *
      ****************/
    /** Allow the file or files from the specified folder to be loaded (repeatable) */
    var allow: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Do print background (default) */
    var background: js.UndefOr[Boolean] = js.undefined
    
    /** Bypass proxy for host (repeatable) */
    var bypassProxyFor: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Web cache directory */
    var cacheDir: js.UndefOr[String] = js.undefined
    
    /** Use this SVG file when rendering checked checkboxes */
    var checkboxCheckedSvg: js.UndefOr[String] = js.undefined
    
    /** Use this SVG file when rendering unchecked checkboxes */
    var checkboxSvg: js.UndefOr[String] = js.undefined
    
    /******************
      * Global options *
      ******************/
    /** Collate when printing multiple copies (default) */
    var collate: js.UndefOr[Boolean] = js.undefined
    
    /** Set an additional cookie (repeatable), value should be url encoded. */
    var cookie: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /** Number of copies to print into the pdf file (default 1) */
    var copies: js.UndefOr[Double] = js.undefined
    
    /**************************************
      * Special keys for node implementation
      **************************************/
    /** Cover object */
    var cover: js.UndefOr[String] = js.undefined
    
    /** Set an additional HTTP header (repeatable) */
    var customHeader: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /** Add HTTP headers specified by --custom-header for each resource request. */
    var customHeaderPropagation: js.UndefOr[Boolean] = js.undefined
    
    /** Debug prints stderr messages */
    var debug: js.UndefOr[Boolean | (js.Function1[/* data */ Buffer, Unit])] = js.undefined
    
    /** Show javascript debugging output */
    var debugJavascript: js.UndefOr[Boolean] = js.undefined
    
    /** debugStdOut prints any stdout warning messages */
    var debugStdOut: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a default header, with the name of the page to the left, and the page number to the right, this is short for:
      * --header-left='[webpage]'
      * --header-right='[page]/[toPage]' --top 2cm
      * --header-line
      */
    var defaultHeader: js.UndefOr[Boolean] = js.undefined
    
    /***************
      * TOC options *
      ***************/
    /** Do not use dotted lines in the toc */
    var disableDottedLines: js.UndefOr[Boolean] = js.undefined
    
    /** Do not make links to remote web pages */
    var disableExternalLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Do not turn HTML form fields into pdf form fields (default) */
    var disableForms: js.UndefOr[Boolean] = js.undefined
    
    /** Do not make local links */
    var disableInternalLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Do not allow web pages to run javascript */
    var disableJavascript: js.UndefOr[Boolean] = js.undefined
    
    /** Do not allowed conversion of a local file to read in other local files, unless explicitly allowed with --allow (default) */
    var disableLocalFileAccess: js.UndefOr[Boolean] = js.undefined
    
    /** Disable installed plugins (default) */
    var disablePlugins: js.UndefOr[Boolean] = js.undefined
    
    /** Disable the intelligent shrinking strategy used by WebKit that makes the pixel/dpi ratio non-constant */
    var disableSmartShrinking: js.UndefOr[Boolean] = js.undefined
    
    /** Do not link from section header to toc (default) */
    var disableTocBackLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Do not link from toc to sections */
    var disableTocLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Change the dpi explicitly (this has no effect on X11 based systems) (default 96) */
    var dpi: js.UndefOr[Double] = js.undefined
    
    /*******************
      * Outline options *
      *******************/
    // Dump the default TOC xsl style sheet to stdout */
    var dumpDefaultTocXsl: js.UndefOr[Boolean] = js.undefined
    
    /** Dump the outline to a file */
    var dumpOutline: js.UndefOr[String] = js.undefined
    
    /** Make links to remote web pages (default) */
    var enableExternalLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Turn HTML form fields into pdf form fields */
    var enableForms: js.UndefOr[Boolean] = js.undefined
    
    /** Make local links (default) */
    var enableInternalLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Do allow web pages to run javascript (default) */
    var enableJavascript: js.UndefOr[Boolean] = js.undefined
    
    /** Allowed conversion of a local file to read in other local files. */
    var enableLocalFileAccess: js.UndefOr[Boolean] = js.undefined
    
    /** Enable installed plugins (plugins will likely not work) */
    var enablePlugins: js.UndefOr[Boolean] = js.undefined
    
    /** Enable the intelligent shrinking strategy used by WebKit that makes the pixel/dpi ratio non-constant (default) */
    var enableSmartShrinking: js.UndefOr[Boolean] = js.undefined
    
    /** Link from section header to toc */
    var enableTocBackLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Set the default text encoding, for input */
    var encoding: js.UndefOr[String] = js.undefined
    
    /** Do not include the page in the table of contents and outlines */
    var excludeFromOutline: js.UndefOr[Boolean] = js.undefined
    
    /*****************************
      * Header and footer options *
      *****************************/
    /** Centered footer text */
    var footerCenter: js.UndefOr[String] = js.undefined
    
    /** Set footer font name (default Arial) */
    var footerFontName: js.UndefOr[String] = js.undefined
    
    /** Set footer font size (default 12) */
    var footerFontSize: js.UndefOr[Double] = js.undefined
    
    /** Adds a html footer should be an URL */
    var footerHtml: js.UndefOr[String] = js.undefined
    
    /** Left aligned footer text */
    var footerLeft: js.UndefOr[String] = js.undefined
    
    /** Display line above the footer */
    var footerLine: js.UndefOr[Boolean] = js.undefined
    
    /** Right aligned footer text */
    var footerRight: js.UndefOr[String] = js.undefined
    
    /** Spacing between footer and content in mm (default 0) */
    var footerSpacing: js.UndefOr[Double] = js.undefined
    
    /** PDF will be generated in grayscale */
    var grayscale: js.UndefOr[Boolean] = js.undefined
    
    /** Centered header text */
    var headerCenter: js.UndefOr[String] = js.undefined
    
    /** Set header font name (default Arial) */
    var headerFontName: js.UndefOr[String] = js.undefined
    
    /** Set header font size (default 12) */
    var headerFontSize: js.UndefOr[Double] = js.undefined
    
    /** Adds a html header should be an URL */
    var headerHtml: js.UndefOr[String] = js.undefined
    
    /** Left aligned header text */
    var headerLeft: js.UndefOr[String] = js.undefined
    
    /** Display line above the header */
    var headerLine: js.UndefOr[Boolean] = js.undefined
    
    /** Right aligned header text */
    var headerRight: js.UndefOr[String] = js.undefined
    
    /** Spacing between header and content in mm (default 0) */
    var headerSpacing: js.UndefOr[Double] = js.undefined
    
    /** Ignore warnings */
    var ignore: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /** When embedding images scale them down to this dpi (default 600) */
    var imageDpi: js.UndefOr[Double] = js.undefined
    
    /** When jpeg compressing images use this quality (default 94) */
    var imageQuality: js.UndefOr[Double] = js.undefined
    
    /** Do load or print images (default) */
    var images: js.UndefOr[Boolean] = js.undefined
    
    /** Include the page in the table of contents and outlines (default) */
    var includeInOutline: js.UndefOr[Boolean] = js.undefined
    
    /** Wait some milliseconds for javascript finish (default 200) */
    var javascriptDelay: js.UndefOr[Double] = js.undefined
    
    /** Keep relative external links as relative external links */
    var keepRelativeLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Specify how to handle pages that fail to load: abort, ignore or skip (default abort) */
    var loadErrorHandling: js.UndefOr[abort | ignore | skip] = js.undefined
    
    /** Specify how to handle media files that fail to load: abort, ignore or skip (default ignore) */
    var loadMediaErrorHandling: js.UndefOr[abort | ignore | skip] = js.undefined
    
    /** Set log level (default info) */
    var logLevel: js.UndefOr[none | error | warn | info] = js.undefined
    
    /** Generates lower quality pdf/ps. Useful to shrink the result document space */
    var lowquality: js.UndefOr[Boolean] = js.undefined
    
    /** Set the page bottom margin in unitreal (e.g 10mm 2cm 0.5in) */
    var marginBottom: js.UndefOr[String] = js.undefined
    
    /** Set the page left margin in unitreal (e.g 10mm 2cm 0.5in) (default 10mm) */
    var marginLeft: js.UndefOr[String] = js.undefined
    
    /** Set the page right margin in unitreal (e.g 10mm 2cm 0.5in) (default 10mm) */
    var marginRight: js.UndefOr[String] = js.undefined
    
    /** Set the page top margin in unitreal (e.g 10mm 2cm 0.5in) */
    var marginTop: js.UndefOr[String] = js.undefined
    
    /** Minimum font size */
    var minimumFontSize: js.UndefOr[Double] = js.undefined
    
    /** Do not print background */
    var noBackground: js.UndefOr[Boolean] = js.undefined
    
    /** Do not collate when printing multiple copies */
    var noCollate: js.UndefOr[Boolean] = js.undefined
    
    /** Do not add HTTP headers specified by --custom-header for each resource request. */
    var noCustomHeaderPropagation: js.UndefOr[Boolean] = js.undefined
    
    /** Do not show javascript debugging output (default) */
    var noDebugJavascript: js.UndefOr[Boolean] = js.undefined
    
    /** Do not display line above the footer (default) */
    var noFooterLine: js.UndefOr[Boolean] = js.undefined
    
    /** Do not display line above the header (default) */
    var noHeaderLine: js.UndefOr[Boolean] = js.undefined
    
    /** Do not load or print images */
    var noImages: js.UndefOr[Boolean] = js.undefined
    
    /** Do not put an outline into the pdf */
    var noOutline: js.UndefOr[Boolean] = js.undefined
    
    /** Do not use lossless compression on pdf objects */
    var noPdfCompression: js.UndefOr[Boolean] = js.undefined
    
    /** Do not use print media-type instead of screen (default) */
    var noPrintMediaType: js.UndefOr[Boolean] = js.undefined
    
    /** Do not Stop slow running javascripts */
    var noStopSlowScripts: js.UndefOr[Boolean] = js.undefined
    
    /** Set orientation to Landscape or Portrait (default Portrait) */
    var orientation: js.UndefOr[Landscape | Portrait] = js.undefined
    
    /** Put an outline into the pdf (default) */
    var outline: js.UndefOr[Boolean] = js.undefined
    
    /** Set the depth of the outline (default 4) */
    var outlineDepth: js.UndefOr[Boolean] = js.undefined
    
    /** If defined only output to this path */
    var output: js.UndefOr[String] = js.undefined
    
    /** Page object */
    var page: js.UndefOr[String] = js.undefined
    
    /** Page height in unitreal (e.g 10mm 2cm 0.5in) */
    var pageHeight: js.UndefOr[String] = js.undefined
    
    /** Set the starting page number (default 0) */
    var pageOffset: js.UndefOr[Double] = js.undefined
    
    /** Set paper size to: A4, Letter, etc. (default A4) */
    var pageSize: js.UndefOr[
        A0 | A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8 | A9 | B0 | B1 | B10 | B2 | B3 | B4 | B5 | B6 | B7 | B8 | B9 | C5E | Comm10E | DLE | Executive | Folio | Ledger | Legal | Letter | Tabloid
      ] = js.undefined
    
    /** Page width in unitreal (e.g 10mm 2cm 0.5in) */
    var pageWidth: js.UndefOr[String] = js.undefined
    
    /** HTTP Authentication password */
    var password: js.UndefOr[String] = js.undefined
    
    /** Add an additional post field */
    var post: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /** Post an additional file (repeatable) */
    var postFile: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /** Use print media-type instead of screen */
    var printMediaType: js.UndefOr[Boolean] = js.undefined
    
    /** Use a proxy */
    var proxy: js.UndefOr[String] = js.undefined
    
    /** Use the proxy for resolving hostnames */
    var proxyHostnameLookup: js.UndefOr[Boolean] = js.undefined
    
    /** Use this SVG file when rendering checked radiobuttons */
    var radiobuttonCheckedSvg: js.UndefOr[String] = js.undefined
    
    /** Use this SVG file when rendering unchecked radiobuttons */
    var radiobuttonSvg: js.UndefOr[String] = js.undefined
    
    /** Replace [name] with value in header and footer (repeatable) */
    var replace: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /** Resolve relative external links into absolute links (default) */
    var resolveRelativeLinks: js.UndefOr[Boolean] = js.undefined
    
    /** Run this additional javascript after the page is done loading (repeatable) */
    var runScript: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Path to the ssl client cert public key in OpenSSL PEM format, optionally followed by intermediate ca and trusted certs */
    var sslCrtPath: js.UndefOr[String] = js.undefined
    
    /** Password to ssl client cert private key */
    var sslKeyPassword: js.UndefOr[String] = js.undefined
    
    /** Path to ssl client cert private key in OpenSSL PEM format */
    var sslKeyPath: js.UndefOr[String] = js.undefined
    
    /** Stop slow running javascripts (default) */
    var stopSlowScripts: js.UndefOr[Boolean] = js.undefined
    
    /** The title of the generated pdf file (The title of the first document is used if not specified) */
    var title: js.UndefOr[String] = js.undefined
    
    /** TOC object */
    var toc: js.UndefOr[String] = js.undefined
    
    /** The header text of the toc (default Table of Contents) */
    var tocHeaderText: js.UndefOr[String] = js.undefined
    
    /** For each level of headings in the toc indent by this length (default 1em) */
    var tocLevelIndentation: js.UndefOr[String] = js.undefined
    
    /** For each level of headings in the toc the font is scaled by this factor (default 0.8) */
    var tocTextSizeShrink: js.UndefOr[Double] = js.undefined
    
    /** Specify a user style sheet, to load with every page */
    var userStyleSheet: js.UndefOr[String] = js.undefined
    
    /** HTTP Authentication username */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Set viewport size if you have custom scrollbars or css attribute overflow to emulate window size
      * Format "1280x1024"
      */
    var viewportSize: js.UndefOr[String] = js.undefined
    
    /** Wait until window.status is equal to this string before rendering page */
    var windowStatus: js.UndefOr[String] = js.undefined
    
    /** Use the supplied xsl style sheet for printing the table of contents */
    var xslStyleSheet: js.UndefOr[String] = js.undefined
    
    /** Use this zoom factor (default 1) */
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBypassProxyFor(value: js.Array[String]): Self = StObject.set(x, "bypassProxyFor", value.asInstanceOf[js.Any])
      
      inline def setBypassProxyForUndefined: Self = StObject.set(x, "bypassProxyFor", js.undefined)
      
      inline def setBypassProxyForVarargs(value: String*): Self = StObject.set(x, "bypassProxyFor", js.Array(value*))
      
      inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      inline def setCheckboxCheckedSvg(value: String): Self = StObject.set(x, "checkboxCheckedSvg", value.asInstanceOf[js.Any])
      
      inline def setCheckboxCheckedSvgUndefined: Self = StObject.set(x, "checkboxCheckedSvg", js.undefined)
      
      inline def setCheckboxSvg(value: String): Self = StObject.set(x, "checkboxSvg", value.asInstanceOf[js.Any])
      
      inline def setCheckboxSvgUndefined: Self = StObject.set(x, "checkboxSvg", js.undefined)
      
      inline def setCollate(value: Boolean): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
      
      inline def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
      
      inline def setCookie(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setCookieVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "cookie", js.Array(value*))
      
      inline def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
      
      inline def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
      
      inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      inline def setCustomHeader(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderPropagation(value: Boolean): Self = StObject.set(x, "customHeaderPropagation", value.asInstanceOf[js.Any])
      
      inline def setCustomHeaderPropagationUndefined: Self = StObject.set(x, "customHeaderPropagation", js.undefined)
      
      inline def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      inline def setCustomHeaderVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "customHeader", js.Array(value*))
      
      inline def setDebug(value: Boolean | (js.Function1[/* data */ Buffer, Unit])): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugFunction1(value: /* data */ Buffer => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setDebugJavascript(value: Boolean): Self = StObject.set(x, "debugJavascript", value.asInstanceOf[js.Any])
      
      inline def setDebugJavascriptUndefined: Self = StObject.set(x, "debugJavascript", js.undefined)
      
      inline def setDebugStdOut(value: Boolean): Self = StObject.set(x, "debugStdOut", value.asInstanceOf[js.Any])
      
      inline def setDebugStdOutUndefined: Self = StObject.set(x, "debugStdOut", js.undefined)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultHeader(value: Boolean): Self = StObject.set(x, "defaultHeader", value.asInstanceOf[js.Any])
      
      inline def setDefaultHeaderUndefined: Self = StObject.set(x, "defaultHeader", js.undefined)
      
      inline def setDisableDottedLines(value: Boolean): Self = StObject.set(x, "disableDottedLines", value.asInstanceOf[js.Any])
      
      inline def setDisableDottedLinesUndefined: Self = StObject.set(x, "disableDottedLines", js.undefined)
      
      inline def setDisableExternalLinks(value: Boolean): Self = StObject.set(x, "disableExternalLinks", value.asInstanceOf[js.Any])
      
      inline def setDisableExternalLinksUndefined: Self = StObject.set(x, "disableExternalLinks", js.undefined)
      
      inline def setDisableForms(value: Boolean): Self = StObject.set(x, "disableForms", value.asInstanceOf[js.Any])
      
      inline def setDisableFormsUndefined: Self = StObject.set(x, "disableForms", js.undefined)
      
      inline def setDisableInternalLinks(value: Boolean): Self = StObject.set(x, "disableInternalLinks", value.asInstanceOf[js.Any])
      
      inline def setDisableInternalLinksUndefined: Self = StObject.set(x, "disableInternalLinks", js.undefined)
      
      inline def setDisableJavascript(value: Boolean): Self = StObject.set(x, "disableJavascript", value.asInstanceOf[js.Any])
      
      inline def setDisableJavascriptUndefined: Self = StObject.set(x, "disableJavascript", js.undefined)
      
      inline def setDisableLocalFileAccess(value: Boolean): Self = StObject.set(x, "disableLocalFileAccess", value.asInstanceOf[js.Any])
      
      inline def setDisableLocalFileAccessUndefined: Self = StObject.set(x, "disableLocalFileAccess", js.undefined)
      
      inline def setDisablePlugins(value: Boolean): Self = StObject.set(x, "disablePlugins", value.asInstanceOf[js.Any])
      
      inline def setDisablePluginsUndefined: Self = StObject.set(x, "disablePlugins", js.undefined)
      
      inline def setDisableSmartShrinking(value: Boolean): Self = StObject.set(x, "disableSmartShrinking", value.asInstanceOf[js.Any])
      
      inline def setDisableSmartShrinkingUndefined: Self = StObject.set(x, "disableSmartShrinking", js.undefined)
      
      inline def setDisableTocBackLinks(value: Boolean): Self = StObject.set(x, "disableTocBackLinks", value.asInstanceOf[js.Any])
      
      inline def setDisableTocBackLinksUndefined: Self = StObject.set(x, "disableTocBackLinks", js.undefined)
      
      inline def setDisableTocLinks(value: Boolean): Self = StObject.set(x, "disableTocLinks", value.asInstanceOf[js.Any])
      
      inline def setDisableTocLinksUndefined: Self = StObject.set(x, "disableTocLinks", js.undefined)
      
      inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
      
      inline def setDumpDefaultTocXsl(value: Boolean): Self = StObject.set(x, "dumpDefaultTocXsl", value.asInstanceOf[js.Any])
      
      inline def setDumpDefaultTocXslUndefined: Self = StObject.set(x, "dumpDefaultTocXsl", js.undefined)
      
      inline def setDumpOutline(value: String): Self = StObject.set(x, "dumpOutline", value.asInstanceOf[js.Any])
      
      inline def setDumpOutlineUndefined: Self = StObject.set(x, "dumpOutline", js.undefined)
      
      inline def setEnableExternalLinks(value: Boolean): Self = StObject.set(x, "enableExternalLinks", value.asInstanceOf[js.Any])
      
      inline def setEnableExternalLinksUndefined: Self = StObject.set(x, "enableExternalLinks", js.undefined)
      
      inline def setEnableForms(value: Boolean): Self = StObject.set(x, "enableForms", value.asInstanceOf[js.Any])
      
      inline def setEnableFormsUndefined: Self = StObject.set(x, "enableForms", js.undefined)
      
      inline def setEnableInternalLinks(value: Boolean): Self = StObject.set(x, "enableInternalLinks", value.asInstanceOf[js.Any])
      
      inline def setEnableInternalLinksUndefined: Self = StObject.set(x, "enableInternalLinks", js.undefined)
      
      inline def setEnableJavascript(value: Boolean): Self = StObject.set(x, "enableJavascript", value.asInstanceOf[js.Any])
      
      inline def setEnableJavascriptUndefined: Self = StObject.set(x, "enableJavascript", js.undefined)
      
      inline def setEnableLocalFileAccess(value: Boolean): Self = StObject.set(x, "enableLocalFileAccess", value.asInstanceOf[js.Any])
      
      inline def setEnableLocalFileAccessUndefined: Self = StObject.set(x, "enableLocalFileAccess", js.undefined)
      
      inline def setEnablePlugins(value: Boolean): Self = StObject.set(x, "enablePlugins", value.asInstanceOf[js.Any])
      
      inline def setEnablePluginsUndefined: Self = StObject.set(x, "enablePlugins", js.undefined)
      
      inline def setEnableSmartShrinking(value: Boolean): Self = StObject.set(x, "enableSmartShrinking", value.asInstanceOf[js.Any])
      
      inline def setEnableSmartShrinkingUndefined: Self = StObject.set(x, "enableSmartShrinking", js.undefined)
      
      inline def setEnableTocBackLinks(value: Boolean): Self = StObject.set(x, "enableTocBackLinks", value.asInstanceOf[js.Any])
      
      inline def setEnableTocBackLinksUndefined: Self = StObject.set(x, "enableTocBackLinks", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExcludeFromOutline(value: Boolean): Self = StObject.set(x, "excludeFromOutline", value.asInstanceOf[js.Any])
      
      inline def setExcludeFromOutlineUndefined: Self = StObject.set(x, "excludeFromOutline", js.undefined)
      
      inline def setFooterCenter(value: String): Self = StObject.set(x, "footerCenter", value.asInstanceOf[js.Any])
      
      inline def setFooterCenterUndefined: Self = StObject.set(x, "footerCenter", js.undefined)
      
      inline def setFooterFontName(value: String): Self = StObject.set(x, "footerFontName", value.asInstanceOf[js.Any])
      
      inline def setFooterFontNameUndefined: Self = StObject.set(x, "footerFontName", js.undefined)
      
      inline def setFooterFontSize(value: Double): Self = StObject.set(x, "footerFontSize", value.asInstanceOf[js.Any])
      
      inline def setFooterFontSizeUndefined: Self = StObject.set(x, "footerFontSize", js.undefined)
      
      inline def setFooterHtml(value: String): Self = StObject.set(x, "footerHtml", value.asInstanceOf[js.Any])
      
      inline def setFooterHtmlUndefined: Self = StObject.set(x, "footerHtml", js.undefined)
      
      inline def setFooterLeft(value: String): Self = StObject.set(x, "footerLeft", value.asInstanceOf[js.Any])
      
      inline def setFooterLeftUndefined: Self = StObject.set(x, "footerLeft", js.undefined)
      
      inline def setFooterLine(value: Boolean): Self = StObject.set(x, "footerLine", value.asInstanceOf[js.Any])
      
      inline def setFooterLineUndefined: Self = StObject.set(x, "footerLine", js.undefined)
      
      inline def setFooterRight(value: String): Self = StObject.set(x, "footerRight", value.asInstanceOf[js.Any])
      
      inline def setFooterRightUndefined: Self = StObject.set(x, "footerRight", js.undefined)
      
      inline def setFooterSpacing(value: Double): Self = StObject.set(x, "footerSpacing", value.asInstanceOf[js.Any])
      
      inline def setFooterSpacingUndefined: Self = StObject.set(x, "footerSpacing", js.undefined)
      
      inline def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      inline def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      inline def setHeaderCenter(value: String): Self = StObject.set(x, "headerCenter", value.asInstanceOf[js.Any])
      
      inline def setHeaderCenterUndefined: Self = StObject.set(x, "headerCenter", js.undefined)
      
      inline def setHeaderFontName(value: String): Self = StObject.set(x, "headerFontName", value.asInstanceOf[js.Any])
      
      inline def setHeaderFontNameUndefined: Self = StObject.set(x, "headerFontName", js.undefined)
      
      inline def setHeaderFontSize(value: Double): Self = StObject.set(x, "headerFontSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderFontSizeUndefined: Self = StObject.set(x, "headerFontSize", js.undefined)
      
      inline def setHeaderHtml(value: String): Self = StObject.set(x, "headerHtml", value.asInstanceOf[js.Any])
      
      inline def setHeaderHtmlUndefined: Self = StObject.set(x, "headerHtml", js.undefined)
      
      inline def setHeaderLeft(value: String): Self = StObject.set(x, "headerLeft", value.asInstanceOf[js.Any])
      
      inline def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
      
      inline def setHeaderLine(value: Boolean): Self = StObject.set(x, "headerLine", value.asInstanceOf[js.Any])
      
      inline def setHeaderLineUndefined: Self = StObject.set(x, "headerLine", js.undefined)
      
      inline def setHeaderRight(value: String): Self = StObject.set(x, "headerRight", value.asInstanceOf[js.Any])
      
      inline def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
      
      inline def setHeaderSpacing(value: Double): Self = StObject.set(x, "headerSpacing", value.asInstanceOf[js.Any])
      
      inline def setHeaderSpacingUndefined: Self = StObject.set(x, "headerSpacing", js.undefined)
      
      inline def setIgnore(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setImageDpi(value: Double): Self = StObject.set(x, "imageDpi", value.asInstanceOf[js.Any])
      
      inline def setImageDpiUndefined: Self = StObject.set(x, "imageDpi", js.undefined)
      
      inline def setImageQuality(value: Double): Self = StObject.set(x, "imageQuality", value.asInstanceOf[js.Any])
      
      inline def setImageQualityUndefined: Self = StObject.set(x, "imageQuality", js.undefined)
      
      inline def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setIncludeInOutline(value: Boolean): Self = StObject.set(x, "includeInOutline", value.asInstanceOf[js.Any])
      
      inline def setIncludeInOutlineUndefined: Self = StObject.set(x, "includeInOutline", js.undefined)
      
      inline def setJavascriptDelay(value: Double): Self = StObject.set(x, "javascriptDelay", value.asInstanceOf[js.Any])
      
      inline def setJavascriptDelayUndefined: Self = StObject.set(x, "javascriptDelay", js.undefined)
      
      inline def setKeepRelativeLinks(value: Boolean): Self = StObject.set(x, "keepRelativeLinks", value.asInstanceOf[js.Any])
      
      inline def setKeepRelativeLinksUndefined: Self = StObject.set(x, "keepRelativeLinks", js.undefined)
      
      inline def setLoadErrorHandling(value: abort | ignore | skip): Self = StObject.set(x, "loadErrorHandling", value.asInstanceOf[js.Any])
      
      inline def setLoadErrorHandlingUndefined: Self = StObject.set(x, "loadErrorHandling", js.undefined)
      
      inline def setLoadMediaErrorHandling(value: abort | ignore | skip): Self = StObject.set(x, "loadMediaErrorHandling", value.asInstanceOf[js.Any])
      
      inline def setLoadMediaErrorHandlingUndefined: Self = StObject.set(x, "loadMediaErrorHandling", js.undefined)
      
      inline def setLogLevel(value: none | error | warn | info): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLowquality(value: Boolean): Self = StObject.set(x, "lowquality", value.asInstanceOf[js.Any])
      
      inline def setLowqualityUndefined: Self = StObject.set(x, "lowquality", js.undefined)
      
      inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMinimumFontSize(value: Double): Self = StObject.set(x, "minimumFontSize", value.asInstanceOf[js.Any])
      
      inline def setMinimumFontSizeUndefined: Self = StObject.set(x, "minimumFontSize", js.undefined)
      
      inline def setNoBackground(value: Boolean): Self = StObject.set(x, "noBackground", value.asInstanceOf[js.Any])
      
      inline def setNoBackgroundUndefined: Self = StObject.set(x, "noBackground", js.undefined)
      
      inline def setNoCollate(value: Boolean): Self = StObject.set(x, "noCollate", value.asInstanceOf[js.Any])
      
      inline def setNoCollateUndefined: Self = StObject.set(x, "noCollate", js.undefined)
      
      inline def setNoCustomHeaderPropagation(value: Boolean): Self = StObject.set(x, "noCustomHeaderPropagation", value.asInstanceOf[js.Any])
      
      inline def setNoCustomHeaderPropagationUndefined: Self = StObject.set(x, "noCustomHeaderPropagation", js.undefined)
      
      inline def setNoDebugJavascript(value: Boolean): Self = StObject.set(x, "noDebugJavascript", value.asInstanceOf[js.Any])
      
      inline def setNoDebugJavascriptUndefined: Self = StObject.set(x, "noDebugJavascript", js.undefined)
      
      inline def setNoFooterLine(value: Boolean): Self = StObject.set(x, "noFooterLine", value.asInstanceOf[js.Any])
      
      inline def setNoFooterLineUndefined: Self = StObject.set(x, "noFooterLine", js.undefined)
      
      inline def setNoHeaderLine(value: Boolean): Self = StObject.set(x, "noHeaderLine", value.asInstanceOf[js.Any])
      
      inline def setNoHeaderLineUndefined: Self = StObject.set(x, "noHeaderLine", js.undefined)
      
      inline def setNoImages(value: Boolean): Self = StObject.set(x, "noImages", value.asInstanceOf[js.Any])
      
      inline def setNoImagesUndefined: Self = StObject.set(x, "noImages", js.undefined)
      
      inline def setNoOutline(value: Boolean): Self = StObject.set(x, "noOutline", value.asInstanceOf[js.Any])
      
      inline def setNoOutlineUndefined: Self = StObject.set(x, "noOutline", js.undefined)
      
      inline def setNoPdfCompression(value: Boolean): Self = StObject.set(x, "noPdfCompression", value.asInstanceOf[js.Any])
      
      inline def setNoPdfCompressionUndefined: Self = StObject.set(x, "noPdfCompression", js.undefined)
      
      inline def setNoPrintMediaType(value: Boolean): Self = StObject.set(x, "noPrintMediaType", value.asInstanceOf[js.Any])
      
      inline def setNoPrintMediaTypeUndefined: Self = StObject.set(x, "noPrintMediaType", js.undefined)
      
      inline def setNoStopSlowScripts(value: Boolean): Self = StObject.set(x, "noStopSlowScripts", value.asInstanceOf[js.Any])
      
      inline def setNoStopSlowScriptsUndefined: Self = StObject.set(x, "noStopSlowScripts", js.undefined)
      
      inline def setOrientation(value: Landscape | Portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineDepth(value: Boolean): Self = StObject.set(x, "outlineDepth", value.asInstanceOf[js.Any])
      
      inline def setOutlineDepthUndefined: Self = StObject.set(x, "outlineDepth", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageHeight(value: String): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      inline def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      inline def setPageOffset(value: Double): Self = StObject.set(x, "pageOffset", value.asInstanceOf[js.Any])
      
      inline def setPageOffsetUndefined: Self = StObject.set(x, "pageOffset", js.undefined)
      
      inline def setPageSize(
        value: A0 | A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8 | A9 | B0 | B1 | B10 | B2 | B3 | B4 | B5 | B6 | B7 | B8 | B9 | C5E | Comm10E | DLE | Executive | Folio | Ledger | Legal | Letter | Tabloid
      ): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPageWidth(value: String): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      inline def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPost(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostFile(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "postFile", value.asInstanceOf[js.Any])
      
      inline def setPostFileUndefined: Self = StObject.set(x, "postFile", js.undefined)
      
      inline def setPostFileVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "postFile", js.Array(value*))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPostVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "post", js.Array(value*))
      
      inline def setPrintMediaType(value: Boolean): Self = StObject.set(x, "printMediaType", value.asInstanceOf[js.Any])
      
      inline def setPrintMediaTypeUndefined: Self = StObject.set(x, "printMediaType", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyHostnameLookup(value: Boolean): Self = StObject.set(x, "proxyHostnameLookup", value.asInstanceOf[js.Any])
      
      inline def setProxyHostnameLookupUndefined: Self = StObject.set(x, "proxyHostnameLookup", js.undefined)
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRadiobuttonCheckedSvg(value: String): Self = StObject.set(x, "radiobuttonCheckedSvg", value.asInstanceOf[js.Any])
      
      inline def setRadiobuttonCheckedSvgUndefined: Self = StObject.set(x, "radiobuttonCheckedSvg", js.undefined)
      
      inline def setRadiobuttonSvg(value: String): Self = StObject.set(x, "radiobuttonSvg", value.asInstanceOf[js.Any])
      
      inline def setRadiobuttonSvgUndefined: Self = StObject.set(x, "radiobuttonSvg", js.undefined)
      
      inline def setReplace(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setReplaceVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "replace", js.Array(value*))
      
      inline def setResolveRelativeLinks(value: Boolean): Self = StObject.set(x, "resolveRelativeLinks", value.asInstanceOf[js.Any])
      
      inline def setResolveRelativeLinksUndefined: Self = StObject.set(x, "resolveRelativeLinks", js.undefined)
      
      inline def setRunScript(value: js.Array[String]): Self = StObject.set(x, "runScript", value.asInstanceOf[js.Any])
      
      inline def setRunScriptUndefined: Self = StObject.set(x, "runScript", js.undefined)
      
      inline def setRunScriptVarargs(value: String*): Self = StObject.set(x, "runScript", js.Array(value*))
      
      inline def setSslCrtPath(value: String): Self = StObject.set(x, "sslCrtPath", value.asInstanceOf[js.Any])
      
      inline def setSslCrtPathUndefined: Self = StObject.set(x, "sslCrtPath", js.undefined)
      
      inline def setSslKeyPassword(value: String): Self = StObject.set(x, "sslKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setSslKeyPasswordUndefined: Self = StObject.set(x, "sslKeyPassword", js.undefined)
      
      inline def setSslKeyPath(value: String): Self = StObject.set(x, "sslKeyPath", value.asInstanceOf[js.Any])
      
      inline def setSslKeyPathUndefined: Self = StObject.set(x, "sslKeyPath", js.undefined)
      
      inline def setStopSlowScripts(value: Boolean): Self = StObject.set(x, "stopSlowScripts", value.asInstanceOf[js.Any])
      
      inline def setStopSlowScriptsUndefined: Self = StObject.set(x, "stopSlowScripts", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToc(value: String): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
      
      inline def setTocHeaderText(value: String): Self = StObject.set(x, "tocHeaderText", value.asInstanceOf[js.Any])
      
      inline def setTocHeaderTextUndefined: Self = StObject.set(x, "tocHeaderText", js.undefined)
      
      inline def setTocLevelIndentation(value: String): Self = StObject.set(x, "tocLevelIndentation", value.asInstanceOf[js.Any])
      
      inline def setTocLevelIndentationUndefined: Self = StObject.set(x, "tocLevelIndentation", js.undefined)
      
      inline def setTocTextSizeShrink(value: Double): Self = StObject.set(x, "tocTextSizeShrink", value.asInstanceOf[js.Any])
      
      inline def setTocTextSizeShrinkUndefined: Self = StObject.set(x, "tocTextSizeShrink", js.undefined)
      
      inline def setTocUndefined: Self = StObject.set(x, "toc", js.undefined)
      
      inline def setUserStyleSheet(value: String): Self = StObject.set(x, "userStyleSheet", value.asInstanceOf[js.Any])
      
      inline def setUserStyleSheetUndefined: Self = StObject.set(x, "userStyleSheet", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setViewportSize(value: String): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
      
      inline def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
      
      inline def setWindowStatus(value: String): Self = StObject.set(x, "windowStatus", value.asInstanceOf[js.Any])
      
      inline def setWindowStatusUndefined: Self = StObject.set(x, "windowStatus", js.undefined)
      
      inline def setXslStyleSheet(value: String): Self = StObject.set(x, "xslStyleSheet", value.asInstanceOf[js.Any])
      
      inline def setXslStyleSheetUndefined: Self = StObject.set(x, "xslStyleSheet", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
}
