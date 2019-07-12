
# Scala.js typings for wordpress__escape-html

Typings are for version 1.4

## Library description:
Escape HTML utils.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @wordpress/escape-html |
| Keywords           | wordpress |
| # releases         | 8 |
| # dependents       | 3 |
| # downloads        | 74534 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/WordPress/gutenberg/tree/master/packages/escape-html/README.md)
- [Bugs](https://github.com/WordPress/gutenberg/issues)
- [Repository](https://github.com/WordPress/gutenberg)
- [Npm](https://www.npmjs.com/package/%40wordpress%2Fescape-html)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for @wordpress/escape-html 1.4
// Project: https://github.com/WordPress/gutenberg/tree/master/packages/escape-html/README.md
// Definitions by: Derek Sifford <https://github.com/dsifford>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.5
/**
 * Returns a string with ampersands escaped.
 *
 * @remarks
 * Note that this is an imperfect implementation, where only ampersands which do not appear as a
 * pattern of named, decimal, or hexadecimal character references are escaped. Invalid named
 * references (i.e. ambiguous ampersand) are are still permitted.
 *
 * See: {@link https://w3c.github.io/html/syntax.html#character-references }
 * See: {@link https://w3c.github.io/html/syntax.html#ambiguous-ampersand }
 * See: {@link https://w3c.github.io/html/syntax.html#named-character-references }
 *
 * @param value - Original string.
 */

```

