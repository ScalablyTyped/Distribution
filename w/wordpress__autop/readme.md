
# Scala.js typings for wordpress__autop

Typings are for version 2.3

## Library description:
WordPress's automatic paragraph functions `autop` and `removep`.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @wordpress/autop |
| Keywords           | wordpress, autop |
| # releases         | 17 |
| # dependents       | 4 |
| # downloads        | 97800 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/WordPress/gutenberg/tree/master/packages/autop/README.md)
- [Bugs](https://github.com/WordPress/gutenberg/issues)
- [Repository](https://github.com/WordPress/gutenberg)
- [Npm](https://www.npmjs.com/package/%40wordpress%2Fautop)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for @wordpress/autop 2.3
// Project: https://github.com/WordPress/gutenberg/tree/master/packages/autop/README.md
// Definitions by: Derek Sifford <https://github.com/dsifford>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.4
/**
 * Replaces double line-breaks with paragraph elements.
 *
 * @remarks
 * A group of regex replaces used to identify text formatted with newlines and
 * replace double line-breaks with HTML paragraph tags. The remaining line-
 * breaks after conversion become `<br />` tags, unless br is set to 'false'.
 *
 * @example
 * ```js
 * import { autop } from '@wordpress/autop';
 * autop( 'my text' ); // "<p>my text</p>"
 * ```
 *
 * @param  text - The text which has to be formatted.
 * @param  br   - Optional. If set, will convert all remaining line- breaks
 *                after paragraphing. Default `true`.
 *
 * @returns Text which has been converted into paragraph tags.
 */

```

