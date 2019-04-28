
# Scala.js typings for verror

Typings are for version 1.10

## Library description:
richer JavaScript errors

|                    |                 |
| ------------------ | :-------------: |
| Full name          | verror |
| Keywords           | - |
| # releases         | 2 |
| # dependents       | 508 |
| # downloads        | 359371175 |
| # stars            | 52 |

## Links
- [Homepage](https://github.com/davepacheco/node-verror)
- [Bugs](https://github.com/davepacheco/node-verror/issues)
- [Repository](https://github.com/davepacheco/node-verror)
- [Npm](https://www.npmjs.com/package/verror)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for verror 1.10
// Project: https://github.com/davepacheco/node-verror
// Definitions by: Sven Reglitzki <https://github.com/svi3c>, Maxime Toumi-M <https://github.com/max4t>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
/*
 * VError([cause], fmt[, arg...]): Like JavaScript's built-in Error class, but
 * supports a "cause" argument (another error) and a printf-style message.  The
 * cause argument can be null or omitted entirely.
 *
 * Examples:
 *
 * CODE                                    MESSAGE
 * new VError('something bad happened')    "something bad happened"
 * new VError('missing file: "%s"', file)  "missing file: "/etc/passwd"
 *   with file = '/etc/passwd'
 * new VError(err, 'open failed')          "open failed: file not found"
 *   with err.message = 'file not found'
 */

```

