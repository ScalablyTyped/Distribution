package typings.wkhtmltopdf.mod

import typings.std.RegExp
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /****************
    * Page options *
    ****************/
  /** Allow the file or files from the specified folder to be loaded (repeatable) */
  var allow: js.UndefOr[js.Array[String]] = js.native
  
  /** Do print background (default) */
  var background: js.UndefOr[Boolean] = js.native
  
  /** Bypass proxy for host (repeatable) */
  var bypassProxyFor: js.UndefOr[js.Array[String]] = js.native
  
  /** Web cache directory */
  var cacheDir: js.UndefOr[String] = js.native
  
  /** Use this SVG file when rendering checked checkboxes */
  var checkboxCheckedSvg: js.UndefOr[String] = js.native
  
  /** Use this SVG file when rendering unchecked checkboxes */
  var checkboxSvg: js.UndefOr[String] = js.native
  
  /******************
    * Global options *
    ******************/
  /** Collate when printing multiple copies (default) */
  var collate: js.UndefOr[Boolean] = js.native
  
  /** Set an additional cookie (repeatable), value should be url encoded. */
  var cookie: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  
  /** Number of copies to print into the pdf file (default 1) */
  var copies: js.UndefOr[Double] = js.native
  
  /**************************************
    * Special keys for node implementation
    **************************************/
  /** Cover object */
  var cover: js.UndefOr[String] = js.native
  
  /** Set an additional HTTP header (repeatable) */
  var customHeader: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  
  /** Add HTTP headers specified by --custom-header for each resource request. */
  var customHeaderPropagation: js.UndefOr[Boolean] = js.native
  
  /** Debug prints stderr messages */
  var debug: js.UndefOr[Boolean] = js.native
  
  /** Show javascript debugging output */
  var debugJavascript: js.UndefOr[Boolean] = js.native
  
  /** debugStdOut prints any stdout warning messages */
  var debugStdOut: js.UndefOr[Boolean] = js.native
  
  /**
    * Add a default header, with the name of the page to the left, and the page number to the right, this is short for:
    * --header-left='[webpage]'
    * --header-right='[page]/[toPage]' --top 2cm
    * --header-line
    */
  var defaultHeader: js.UndefOr[Boolean] = js.native
  
  /***************
    * TOC options *
    ***************/
  /** Do not use dotted lines in the toc */
  var disableDottedLines: js.UndefOr[Boolean] = js.native
  
  /** Do not make links to remote web pages */
  var disableExternalLinks: js.UndefOr[Boolean] = js.native
  
  /** Do not turn HTML form fields into pdf form fields (default) */
  var disableForms: js.UndefOr[Boolean] = js.native
  
  /** Do not make local links */
  var disableInternalLinks: js.UndefOr[Boolean] = js.native
  
  /** Do not allow web pages to run javascript */
  var disableJavascript: js.UndefOr[Boolean] = js.native
  
  /** Do not allowed conversion of a local file to read in other local files, unless explicitly allowed with --allow (default) */
  var disableLocalFileAccess: js.UndefOr[Boolean] = js.native
  
  /** Disable installed plugins (default) */
  var disablePlugins: js.UndefOr[Boolean] = js.native
  
  /** Disable the intelligent shrinking strategy used by WebKit that makes the pixel/dpi ratio non-constant */
  var disableSmartShrinking: js.UndefOr[Boolean] = js.native
  
  /** Do not link from section header to toc (default) */
  var disableTocBackLinks: js.UndefOr[Boolean] = js.native
  
  /** Do not link from toc to sections */
  var disableTocLinks: js.UndefOr[Boolean] = js.native
  
  /** Change the dpi explicitly (this has no effect on X11 based systems) (default 96) */
  var dpi: js.UndefOr[Double] = js.native
  
  /*******************
    * Outline options *
    *******************/
  // Dump the default TOC xsl style sheet to stdout */
  var dumpDefaultTocXsl: js.UndefOr[Boolean] = js.native
  
  /** Dump the outline to a file */
  var dumpOutline: js.UndefOr[String] = js.native
  
  /** Make links to remote web pages (default) */
  var enableExternalLinks: js.UndefOr[Boolean] = js.native
  
  /** Turn HTML form fields into pdf form fields */
  var enableForms: js.UndefOr[Boolean] = js.native
  
  /** Make local links (default) */
  var enableInternalLinks: js.UndefOr[Boolean] = js.native
  
  /** Do allow web pages to run javascript (default) */
  var enableJavascript: js.UndefOr[Boolean] = js.native
  
  /** Allowed conversion of a local file to read in other local files. */
  var enableLocalFileAccess: js.UndefOr[Boolean] = js.native
  
  /** Enable installed plugins (plugins will likely not work) */
  var enablePlugins: js.UndefOr[Boolean] = js.native
  
  /** Enable the intelligent shrinking strategy used by WebKit that makes the pixel/dpi ratio non-constant (default) */
  var enableSmartShrinking: js.UndefOr[Boolean] = js.native
  
  /** Link from section header to toc */
  var enableTocBackLinks: js.UndefOr[Boolean] = js.native
  
  /** Set the default text encoding, for input */
  var encoding: js.UndefOr[String] = js.native
  
  /** Do not include the page in the table of contents and outlines */
  var excludeFromOutline: js.UndefOr[Boolean] = js.native
  
  /*****************************
    * Header and footer options *
    *****************************/
  /** Centered footer text */
  var footerCenter: js.UndefOr[String] = js.native
  
  /** Set footer font name (default Arial) */
  var footerFontName: js.UndefOr[String] = js.native
  
  /** Set footer font size (default 12) */
  var footerFontSize: js.UndefOr[Double] = js.native
  
  /** Adds a html footer should be an URL */
  var footerHtml: js.UndefOr[String] = js.native
  
  /** Left aligned footer text */
  var footerLeft: js.UndefOr[String] = js.native
  
  /** Display line above the footer */
  var footerLine: js.UndefOr[Boolean] = js.native
  
  /** Right aligned footer text */
  var footerRight: js.UndefOr[String] = js.native
  
  /** Spacing between footer and content in mm (e.g 10mm 2cm 0.5in) (default 0) */
  var footerSpacing: js.UndefOr[String] = js.native
  
  /** PDF will be generated in grayscale */
  var grayscale: js.UndefOr[Boolean] = js.native
  
  /** Centered header text */
  var headerCenter: js.UndefOr[String] = js.native
  
  /** Set header font name (default Arial) */
  var headerFontName: js.UndefOr[String] = js.native
  
  /** Set header font size (default 12) */
  var headerFontSize: js.UndefOr[Double] = js.native
  
  /** Adds a html header should be an URL */
  var headerHtml: js.UndefOr[String] = js.native
  
  /** Left aligned header text */
  var headerLeft: js.UndefOr[String] = js.native
  
  /** Display line above the header */
  var headerLine: js.UndefOr[Boolean] = js.native
  
  /** Right aligned header text */
  var headerRight: js.UndefOr[String] = js.native
  
  /** Spacing between header and content in mm (e.g 10mm 2cm 0.5in) (default 0) */
  var headerSpacing: js.UndefOr[String] = js.native
  
  /** Ignore warnings */
  var ignore: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /** When embedding images scale them down to this dpi (default 600) */
  var imageDpi: js.UndefOr[Double] = js.native
  
  /** When jpeg compressing images use this quality (default 94) */
  var imageQuality: js.UndefOr[Double] = js.native
  
  /** Do load or print images (default) */
  var images: js.UndefOr[Boolean] = js.native
  
  /** Include the page in the table of contents and outlines (default) */
  var includeInOutline: js.UndefOr[Boolean] = js.native
  
  /** Wait some milliseconds for javascript finish (default 200) */
  var javascriptDelay: js.UndefOr[Double] = js.native
  
  /** Keep relative external links as relative external links */
  var keepRelativeLinks: js.UndefOr[Boolean] = js.native
  
  /** Specify how to handle pages that fail to load: abort, ignore or skip (default abort) */
  var loadErrorHandling: js.UndefOr[abort | ignore | skip] = js.native
  
  /** Specify how to handle media files that fail to load: abort, ignore or skip (default ignore) */
  var loadMediaErrorHandling: js.UndefOr[abort | ignore | skip] = js.native
  
  /** Set log level (default info) */
  var logLevel: js.UndefOr[none | error | warn | info] = js.native
  
  /** Generates lower quality pdf/ps. Useful to shrink the result document space */
  var lowquality: js.UndefOr[Boolean] = js.native
  
  /** Set the page bottom margin in unitreal (e.g 10mm 2cm 0.5in) */
  var marginBottom: js.UndefOr[String] = js.native
  
  /** Set the page left margin in unitreal (e.g 10mm 2cm 0.5in) (default 10mm) */
  var marginLeft: js.UndefOr[String] = js.native
  
  /** Set the page right margin in unitreal (e.g 10mm 2cm 0.5in) (default 10mm) */
  var marginRight: js.UndefOr[String] = js.native
  
  /** Set the page top margin in unitreal (e.g 10mm 2cm 0.5in) */
  var marginTop: js.UndefOr[String] = js.native
  
  /** Minimum font size */
  var minimumFontSize: js.UndefOr[Double] = js.native
  
  /** Do not print background */
  var noBackground: js.UndefOr[Boolean] = js.native
  
  /** Do not collate when printing multiple copies */
  var noCollate: js.UndefOr[Boolean] = js.native
  
  /** Do not add HTTP headers specified by --custom-header for each resource request. */
  var noCustomHeaderPropagation: js.UndefOr[Boolean] = js.native
  
  /** Do not show javascript debugging output (default) */
  var noDebugJavascript: js.UndefOr[Boolean] = js.native
  
  /** Do not display line above the footer (default) */
  var noFooterLine: js.UndefOr[Boolean] = js.native
  
  /** Do not display line above the header (default) */
  var noHeaderLine: js.UndefOr[Boolean] = js.native
  
  /** Do not load or print images */
  var noImages: js.UndefOr[Boolean] = js.native
  
  /** Do not put an outline into the pdf */
  var noOutline: js.UndefOr[Boolean] = js.native
  
  /** Do not use lossless compression on pdf objects */
  var noPdfCompression: js.UndefOr[Boolean] = js.native
  
  /** Do not use print media-type instead of screen (default) */
  var noPrintMediaType: js.UndefOr[Boolean] = js.native
  
  /** Do not Stop slow running javascripts */
  var noStopSlowScripts: js.UndefOr[Boolean] = js.native
  
  /** Set orientation to Landscape or Portrait (default Portrait) */
  var orientation: js.UndefOr[Landscape | Portrait] = js.native
  
  /** Put an outline into the pdf (default) */
  var outline: js.UndefOr[Boolean] = js.native
  
  /** Set the depth of the outline (default 4) */
  var outlineDepth: js.UndefOr[Boolean] = js.native
  
  /** Page object */
  var page: js.UndefOr[String] = js.native
  
  /** Page height in unitreal (e.g 10mm 2cm 0.5in) */
  var pageHeight: js.UndefOr[String] = js.native
  
  /** Set the starting page number (default 0) */
  var pageOffset: js.UndefOr[Double] = js.native
  
  /** Set paper size to: A4, Letter, etc. (default A4) */
  var pageSize: js.UndefOr[
    A0 | A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8 | A9 | B0 | B1 | B10 | B2 | B3 | B4 | B5 | B6 | B7 | B8 | B9 | C5E | Comm10E | DLE | Executive | Folio | Ledger | Legal | Letter | Tabloid
  ] = js.native
  
  /** Page width in unitreal (e.g 10mm 2cm 0.5in) */
  var pageWidth: js.UndefOr[String] = js.native
  
  /** HTTP Authentication password */
  var password: js.UndefOr[String] = js.native
  
  /** Add an additional post field */
  var post: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  
  /** Post an additional file (repeatable) */
  var postFile: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  
  /** Use print media-type instead of screen */
  var printMediaType: js.UndefOr[Boolean] = js.native
  
  /** Use a proxy */
  var proxy: js.UndefOr[String] = js.native
  
  /** Use the proxy for resolving hostnames */
  var proxyHostnameLookup: js.UndefOr[Boolean] = js.native
  
  /** Use this SVG file when rendering checked radiobuttons */
  var radiobuttonCheckedSvg: js.UndefOr[String] = js.native
  
  /** Use this SVG file when rendering unchecked radiobuttons */
  var radiobuttonSvg: js.UndefOr[String] = js.native
  
  /** Replace [name] with value in header and footer (repeatable) */
  var replace: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  
  /** Resolve relative external links into absolute links (default) */
  var resolveRelativeLinks: js.UndefOr[Boolean] = js.native
  
  /** Run this additional javascript after the page is done loading (repeatable) */
  var runScript: js.UndefOr[js.Array[String]] = js.native
  
  /** Path to the ssl client cert public key in OpenSSL PEM format, optionally followed by intermediate ca and trusted certs */
  var sslCrtPath: js.UndefOr[String] = js.native
  
  /** Password to ssl client cert private key */
  var sslKeyPassword: js.UndefOr[String] = js.native
  
  /** Path to ssl client cert private key in OpenSSL PEM format */
  var sslKeyPath: js.UndefOr[String] = js.native
  
  /** Stop slow running javascripts (default) */
  var stopSlowScripts: js.UndefOr[Boolean] = js.native
  
  /** The title of the generated pdf file (The title of the first document is used if not specified) */
  var title: js.UndefOr[String] = js.native
  
  /** TOC object */
  var toc: js.UndefOr[String] = js.native
  
  /** The header text of the toc (default Table of Contents) */
  var tocHeaderText: js.UndefOr[String] = js.native
  
  /** For each level of headings in the toc indent by this length (default 1em) */
  var tocLevelIndentation: js.UndefOr[String] = js.native
  
  /** For each level of headings in the toc the font is scaled by this factor (default 0.8) */
  var tocTextSizeShrink: js.UndefOr[Double] = js.native
  
  /** Specify a user style sheet, to load with every page */
  var userStyleSheet: js.UndefOr[String] = js.native
  
  /** HTTP Authentication username */
  var username: js.UndefOr[String] = js.native
  
  /**
    * Set viewport size if you have custom scrollbars or css attribute overflow to emulate window size
    * Format "1280x1024"
    */
  var viewportSize: js.UndefOr[String] = js.native
  
  /** Wait until window.status is equal to this string before rendering page */
  var windowStatus: js.UndefOr[String] = js.native
  
  /** Use the supplied xsl style sheet for printing the table of contents */
  var xslStyleSheet: js.UndefOr[String] = js.native
  
  /** Use this zoom factor (default 1) */
  var zoom: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowVarargs(value: String*): Self = this.set("allow", js.Array(value :_*))
    
    @scala.inline
    def setAllow(value: js.Array[String]): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBypassProxyForVarargs(value: String*): Self = this.set("bypassProxyFor", js.Array(value :_*))
    
    @scala.inline
    def setBypassProxyFor(value: js.Array[String]): Self = this.set("bypassProxyFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBypassProxyFor: Self = this.set("bypassProxyFor", js.undefined)
    
    @scala.inline
    def setCacheDir(value: String): Self = this.set("cacheDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDir: Self = this.set("cacheDir", js.undefined)
    
    @scala.inline
    def setCheckboxCheckedSvg(value: String): Self = this.set("checkboxCheckedSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxCheckedSvg: Self = this.set("checkboxCheckedSvg", js.undefined)
    
    @scala.inline
    def setCheckboxSvg(value: String): Self = this.set("checkboxSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxSvg: Self = this.set("checkboxSvg", js.undefined)
    
    @scala.inline
    def setCollate(value: Boolean): Self = this.set("collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollate: Self = this.set("collate", js.undefined)
    
    @scala.inline
    def setCookieVarargs(value: (js.Tuple2[String, String])*): Self = this.set("cookie", js.Array(value :_*))
    
    @scala.inline
    def setCookie(value: js.Array[js.Tuple2[String, String]]): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopies: Self = this.set("copies", js.undefined)
    
    @scala.inline
    def setCover(value: String): Self = this.set("cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCover: Self = this.set("cover", js.undefined)
    
    @scala.inline
    def setCustomHeaderVarargs(value: (js.Tuple2[String, String])*): Self = this.set("customHeader", js.Array(value :_*))
    
    @scala.inline
    def setCustomHeader(value: js.Array[js.Tuple2[String, String]]): Self = this.set("customHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeader: Self = this.set("customHeader", js.undefined)
    
    @scala.inline
    def setCustomHeaderPropagation(value: Boolean): Self = this.set("customHeaderPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaderPropagation: Self = this.set("customHeaderPropagation", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDebugJavascript(value: Boolean): Self = this.set("debugJavascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugJavascript: Self = this.set("debugJavascript", js.undefined)
    
    @scala.inline
    def setDebugStdOut(value: Boolean): Self = this.set("debugStdOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugStdOut: Self = this.set("debugStdOut", js.undefined)
    
    @scala.inline
    def setDefaultHeader(value: Boolean): Self = this.set("defaultHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultHeader: Self = this.set("defaultHeader", js.undefined)
    
    @scala.inline
    def setDisableDottedLines(value: Boolean): Self = this.set("disableDottedLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDottedLines: Self = this.set("disableDottedLines", js.undefined)
    
    @scala.inline
    def setDisableExternalLinks(value: Boolean): Self = this.set("disableExternalLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableExternalLinks: Self = this.set("disableExternalLinks", js.undefined)
    
    @scala.inline
    def setDisableForms(value: Boolean): Self = this.set("disableForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableForms: Self = this.set("disableForms", js.undefined)
    
    @scala.inline
    def setDisableInternalLinks(value: Boolean): Self = this.set("disableInternalLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInternalLinks: Self = this.set("disableInternalLinks", js.undefined)
    
    @scala.inline
    def setDisableJavascript(value: Boolean): Self = this.set("disableJavascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableJavascript: Self = this.set("disableJavascript", js.undefined)
    
    @scala.inline
    def setDisableLocalFileAccess(value: Boolean): Self = this.set("disableLocalFileAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLocalFileAccess: Self = this.set("disableLocalFileAccess", js.undefined)
    
    @scala.inline
    def setDisablePlugins(value: Boolean): Self = this.set("disablePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePlugins: Self = this.set("disablePlugins", js.undefined)
    
    @scala.inline
    def setDisableSmartShrinking(value: Boolean): Self = this.set("disableSmartShrinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSmartShrinking: Self = this.set("disableSmartShrinking", js.undefined)
    
    @scala.inline
    def setDisableTocBackLinks(value: Boolean): Self = this.set("disableTocBackLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTocBackLinks: Self = this.set("disableTocBackLinks", js.undefined)
    
    @scala.inline
    def setDisableTocLinks(value: Boolean): Self = this.set("disableTocLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTocLinks: Self = this.set("disableTocLinks", js.undefined)
    
    @scala.inline
    def setDpi(value: Double): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    
    @scala.inline
    def setDumpDefaultTocXsl(value: Boolean): Self = this.set("dumpDefaultTocXsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpDefaultTocXsl: Self = this.set("dumpDefaultTocXsl", js.undefined)
    
    @scala.inline
    def setDumpOutline(value: String): Self = this.set("dumpOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDumpOutline: Self = this.set("dumpOutline", js.undefined)
    
    @scala.inline
    def setEnableExternalLinks(value: Boolean): Self = this.set("enableExternalLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExternalLinks: Self = this.set("enableExternalLinks", js.undefined)
    
    @scala.inline
    def setEnableForms(value: Boolean): Self = this.set("enableForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableForms: Self = this.set("enableForms", js.undefined)
    
    @scala.inline
    def setEnableInternalLinks(value: Boolean): Self = this.set("enableInternalLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInternalLinks: Self = this.set("enableInternalLinks", js.undefined)
    
    @scala.inline
    def setEnableJavascript(value: Boolean): Self = this.set("enableJavascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableJavascript: Self = this.set("enableJavascript", js.undefined)
    
    @scala.inline
    def setEnableLocalFileAccess(value: Boolean): Self = this.set("enableLocalFileAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLocalFileAccess: Self = this.set("enableLocalFileAccess", js.undefined)
    
    @scala.inline
    def setEnablePlugins(value: Boolean): Self = this.set("enablePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePlugins: Self = this.set("enablePlugins", js.undefined)
    
    @scala.inline
    def setEnableSmartShrinking(value: Boolean): Self = this.set("enableSmartShrinking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSmartShrinking: Self = this.set("enableSmartShrinking", js.undefined)
    
    @scala.inline
    def setEnableTocBackLinks(value: Boolean): Self = this.set("enableTocBackLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTocBackLinks: Self = this.set("enableTocBackLinks", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setExcludeFromOutline(value: Boolean): Self = this.set("excludeFromOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFromOutline: Self = this.set("excludeFromOutline", js.undefined)
    
    @scala.inline
    def setFooterCenter(value: String): Self = this.set("footerCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterCenter: Self = this.set("footerCenter", js.undefined)
    
    @scala.inline
    def setFooterFontName(value: String): Self = this.set("footerFontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterFontName: Self = this.set("footerFontName", js.undefined)
    
    @scala.inline
    def setFooterFontSize(value: Double): Self = this.set("footerFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterFontSize: Self = this.set("footerFontSize", js.undefined)
    
    @scala.inline
    def setFooterHtml(value: String): Self = this.set("footerHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterHtml: Self = this.set("footerHtml", js.undefined)
    
    @scala.inline
    def setFooterLeft(value: String): Self = this.set("footerLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterLeft: Self = this.set("footerLeft", js.undefined)
    
    @scala.inline
    def setFooterLine(value: Boolean): Self = this.set("footerLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterLine: Self = this.set("footerLine", js.undefined)
    
    @scala.inline
    def setFooterRight(value: String): Self = this.set("footerRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRight: Self = this.set("footerRight", js.undefined)
    
    @scala.inline
    def setFooterSpacing(value: String): Self = this.set("footerSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterSpacing: Self = this.set("footerSpacing", js.undefined)
    
    @scala.inline
    def setGrayscale(value: Boolean): Self = this.set("grayscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrayscale: Self = this.set("grayscale", js.undefined)
    
    @scala.inline
    def setHeaderCenter(value: String): Self = this.set("headerCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderCenter: Self = this.set("headerCenter", js.undefined)
    
    @scala.inline
    def setHeaderFontName(value: String): Self = this.set("headerFontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFontName: Self = this.set("headerFontName", js.undefined)
    
    @scala.inline
    def setHeaderFontSize(value: Double): Self = this.set("headerFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFontSize: Self = this.set("headerFontSize", js.undefined)
    
    @scala.inline
    def setHeaderHtml(value: String): Self = this.set("headerHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHtml: Self = this.set("headerHtml", js.undefined)
    
    @scala.inline
    def setHeaderLeft(value: String): Self = this.set("headerLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderLeft: Self = this.set("headerLeft", js.undefined)
    
    @scala.inline
    def setHeaderLine(value: Boolean): Self = this.set("headerLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderLine: Self = this.set("headerLine", js.undefined)
    
    @scala.inline
    def setHeaderRight(value: String): Self = this.set("headerRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderRight: Self = this.set("headerRight", js.undefined)
    
    @scala.inline
    def setHeaderSpacing(value: String): Self = this.set("headerSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderSpacing: Self = this.set("headerSpacing", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: (String | RegExp)*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String | RegExp]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setImageDpi(value: Double): Self = this.set("imageDpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDpi: Self = this.set("imageDpi", js.undefined)
    
    @scala.inline
    def setImageQuality(value: Double): Self = this.set("imageQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageQuality: Self = this.set("imageQuality", js.undefined)
    
    @scala.inline
    def setImages(value: Boolean): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setIncludeInOutline(value: Boolean): Self = this.set("includeInOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInOutline: Self = this.set("includeInOutline", js.undefined)
    
    @scala.inline
    def setJavascriptDelay(value: Double): Self = this.set("javascriptDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJavascriptDelay: Self = this.set("javascriptDelay", js.undefined)
    
    @scala.inline
    def setKeepRelativeLinks(value: Boolean): Self = this.set("keepRelativeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepRelativeLinks: Self = this.set("keepRelativeLinks", js.undefined)
    
    @scala.inline
    def setLoadErrorHandling(value: abort | ignore | skip): Self = this.set("loadErrorHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadErrorHandling: Self = this.set("loadErrorHandling", js.undefined)
    
    @scala.inline
    def setLoadMediaErrorHandling(value: abort | ignore | skip): Self = this.set("loadMediaErrorHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMediaErrorHandling: Self = this.set("loadMediaErrorHandling", js.undefined)
    
    @scala.inline
    def setLogLevel(value: none | error | warn | info): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLowquality(value: Boolean): Self = this.set("lowquality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowquality: Self = this.set("lowquality", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: String): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: String): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: String): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: String): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMinimumFontSize(value: Double): Self = this.set("minimumFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFontSize: Self = this.set("minimumFontSize", js.undefined)
    
    @scala.inline
    def setNoBackground(value: Boolean): Self = this.set("noBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBackground: Self = this.set("noBackground", js.undefined)
    
    @scala.inline
    def setNoCollate(value: Boolean): Self = this.set("noCollate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCollate: Self = this.set("noCollate", js.undefined)
    
    @scala.inline
    def setNoCustomHeaderPropagation(value: Boolean): Self = this.set("noCustomHeaderPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoCustomHeaderPropagation: Self = this.set("noCustomHeaderPropagation", js.undefined)
    
    @scala.inline
    def setNoDebugJavascript(value: Boolean): Self = this.set("noDebugJavascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDebugJavascript: Self = this.set("noDebugJavascript", js.undefined)
    
    @scala.inline
    def setNoFooterLine(value: Boolean): Self = this.set("noFooterLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoFooterLine: Self = this.set("noFooterLine", js.undefined)
    
    @scala.inline
    def setNoHeaderLine(value: Boolean): Self = this.set("noHeaderLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoHeaderLine: Self = this.set("noHeaderLine", js.undefined)
    
    @scala.inline
    def setNoImages(value: Boolean): Self = this.set("noImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoImages: Self = this.set("noImages", js.undefined)
    
    @scala.inline
    def setNoOutline(value: Boolean): Self = this.set("noOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoOutline: Self = this.set("noOutline", js.undefined)
    
    @scala.inline
    def setNoPdfCompression(value: Boolean): Self = this.set("noPdfCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPdfCompression: Self = this.set("noPdfCompression", js.undefined)
    
    @scala.inline
    def setNoPrintMediaType(value: Boolean): Self = this.set("noPrintMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoPrintMediaType: Self = this.set("noPrintMediaType", js.undefined)
    
    @scala.inline
    def setNoStopSlowScripts(value: Boolean): Self = this.set("noStopSlowScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStopSlowScripts: Self = this.set("noStopSlowScripts", js.undefined)
    
    @scala.inline
    def setOrientation(value: Landscape | Portrait): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setOutlineDepth(value: Boolean): Self = this.set("outlineDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineDepth: Self = this.set("outlineDepth", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPageHeight(value: String): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
    
    @scala.inline
    def setPageOffset(value: Double): Self = this.set("pageOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageOffset: Self = this.set("pageOffset", js.undefined)
    
    @scala.inline
    def setPageSize(
      value: A0 | A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8 | A9 | B0 | B1 | B10 | B2 | B3 | B4 | B5 | B6 | B7 | B8 | B9 | C5E | Comm10E | DLE | Executive | Folio | Ledger | Legal | Letter | Tabloid
    ): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageWidth(value: String): Self = this.set("pageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageWidth: Self = this.set("pageWidth", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPostVarargs(value: (js.Tuple2[String, String])*): Self = this.set("post", js.Array(value :_*))
    
    @scala.inline
    def setPost(value: js.Array[js.Tuple2[String, String]]): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPostFileVarargs(value: (js.Tuple2[String, String])*): Self = this.set("postFile", js.Array(value :_*))
    
    @scala.inline
    def setPostFile(value: js.Array[js.Tuple2[String, String]]): Self = this.set("postFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostFile: Self = this.set("postFile", js.undefined)
    
    @scala.inline
    def setPrintMediaType(value: Boolean): Self = this.set("printMediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintMediaType: Self = this.set("printMediaType", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setProxyHostnameLookup(value: Boolean): Self = this.set("proxyHostnameLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyHostnameLookup: Self = this.set("proxyHostnameLookup", js.undefined)
    
    @scala.inline
    def setRadiobuttonCheckedSvg(value: String): Self = this.set("radiobuttonCheckedSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiobuttonCheckedSvg: Self = this.set("radiobuttonCheckedSvg", js.undefined)
    
    @scala.inline
    def setRadiobuttonSvg(value: String): Self = this.set("radiobuttonSvg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiobuttonSvg: Self = this.set("radiobuttonSvg", js.undefined)
    
    @scala.inline
    def setReplaceVarargs(value: (js.Tuple2[String, String])*): Self = this.set("replace", js.Array(value :_*))
    
    @scala.inline
    def setReplace(value: js.Array[js.Tuple2[String, String]]): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setResolveRelativeLinks(value: Boolean): Self = this.set("resolveRelativeLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveRelativeLinks: Self = this.set("resolveRelativeLinks", js.undefined)
    
    @scala.inline
    def setRunScriptVarargs(value: String*): Self = this.set("runScript", js.Array(value :_*))
    
    @scala.inline
    def setRunScript(value: js.Array[String]): Self = this.set("runScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunScript: Self = this.set("runScript", js.undefined)
    
    @scala.inline
    def setSslCrtPath(value: String): Self = this.set("sslCrtPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCrtPath: Self = this.set("sslCrtPath", js.undefined)
    
    @scala.inline
    def setSslKeyPassword(value: String): Self = this.set("sslKeyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslKeyPassword: Self = this.set("sslKeyPassword", js.undefined)
    
    @scala.inline
    def setSslKeyPath(value: String): Self = this.set("sslKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslKeyPath: Self = this.set("sslKeyPath", js.undefined)
    
    @scala.inline
    def setStopSlowScripts(value: Boolean): Self = this.set("stopSlowScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopSlowScripts: Self = this.set("stopSlowScripts", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToc(value: String): Self = this.set("toc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToc: Self = this.set("toc", js.undefined)
    
    @scala.inline
    def setTocHeaderText(value: String): Self = this.set("tocHeaderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTocHeaderText: Self = this.set("tocHeaderText", js.undefined)
    
    @scala.inline
    def setTocLevelIndentation(value: String): Self = this.set("tocLevelIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTocLevelIndentation: Self = this.set("tocLevelIndentation", js.undefined)
    
    @scala.inline
    def setTocTextSizeShrink(value: Double): Self = this.set("tocTextSizeShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTocTextSizeShrink: Self = this.set("tocTextSizeShrink", js.undefined)
    
    @scala.inline
    def setUserStyleSheet(value: String): Self = this.set("userStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStyleSheet: Self = this.set("userStyleSheet", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
    
    @scala.inline
    def setViewportSize(value: String): Self = this.set("viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportSize: Self = this.set("viewportSize", js.undefined)
    
    @scala.inline
    def setWindowStatus(value: String): Self = this.set("windowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowStatus: Self = this.set("windowStatus", js.undefined)
    
    @scala.inline
    def setXslStyleSheet(value: String): Self = this.set("xslStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXslStyleSheet: Self = this.set("xslStyleSheet", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
