package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "MarkdownString")
@js.native
/**
  * Creates a new markdown string with the given value.
  *
  * @param value Optional, initial value.
  * @param supportThemeIcons Optional, Specifies whether {@link ThemeIcon ThemeIcons} are supported within the {@linkcode MarkdownString}.
  */
open class MarkdownString () extends StObject {
  def this(value: String) = this()
  def this(value: String, supportThemeIcons: Boolean) = this()
  def this(value: Unit, supportThemeIcons: Boolean) = this()
  
  /**
    * Appends the given string as codeblock using the provided language.
    * @param value A code snippet.
    * @param language An optional {@link languages.getLanguages language identifier}.
    */
  def appendCodeblock(value: String): MarkdownString = js.native
  def appendCodeblock(value: String, language: String): MarkdownString = js.native
  
  /**
    * Appends the given string 'as is' to this markdown string. When {@linkcode MarkdownString.supportThemeIcons supportThemeIcons} is `true`, {@link ThemeIcon ThemeIcons} in the `value` will be iconified.
    * @param value Markdown string.
    */
  def appendMarkdown(value: String): MarkdownString = js.native
  
  /**
    * Appends and escapes the given string to this markdown string.
    * @param value Plain text.
    */
  def appendText(value: String): MarkdownString = js.native
  
  /**
    * Uri that relative paths are resolved relative to.
    *
    * If the `baseUri` ends with `/`, it is considered a directory and relative paths in the markdown are resolved relative to that directory:
    *
    * ```ts
    * const md = new vscode.MarkdownString(`[link](./file.js)`);
    * md.baseUri = vscode.Uri.file('/path/to/dir/');
    * // Here 'link' in the rendered markdown resolves to '/path/to/dir/file.js'
    * ```
    *
    * If the `baseUri` is a file, relative paths in the markdown are resolved relative to the parent dir of that file:
    *
    * ```ts
    * const md = new vscode.MarkdownString(`[link](./file.js)`);
    * md.baseUri = vscode.Uri.file('/path/to/otherFile.js');
    * // Here 'link' in the rendered markdown resolves to '/path/to/file.js'
    * ```
    */
  var baseUri: js.UndefOr[Uri] = js.native
  
  /**
    * Indicates that this markdown string is from a trusted source. Only *trusted*
    * markdown supports links that execute commands, e.g. `[Run it](command:myCommandId)`.
    */
  var isTrusted: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that this markdown string can contain raw html tags. Defaults to `false`.
    *
    * When `supportHtml` is false, the markdown renderer will strip out any raw html tags
    * that appear in the markdown text. This means you can only use markdown syntax for rendering.
    *
    * When `supportHtml` is true, the markdown render will also allow a safe subset of html tags
    * and attributes to be rendered. See https://github.com/microsoft/vscode/blob/6d2920473c6f13759c978dd89104c4270a83422d/src/vs/base/browser/markdownRenderer.ts#L296
    * for a list of all supported tags and attributes.
    */
  var supportHtml: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that this markdown string can contain {@link ThemeIcon ThemeIcons}, e.g. `$(zap)`.
    */
  var supportThemeIcons: js.UndefOr[Boolean] = js.native
  
  /**
    * The markdown string.
    */
  var value: String = js.native
}
